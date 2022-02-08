package com.check.remote

import com.check.core.base.TestResponse.RESPONSE_FORM_WITH_NO_SECTION
import com.check.data.models.FieldEntity
import com.check.data.remote.FormRemote
import com.check.remote.mapper.FieldResponseMapper
import com.check.remote.model.FormResponse
import com.google.gson.Gson

class HomeRemoteImp(private val mapper: FieldResponseMapper) : FormRemote {
    override fun getForm(): List<FieldEntity> {
        val asw = getFieldsAfterAddNodeChildrenToParent()
        val aswf = asw[6]
        repeat(1000){
            asw.add(aswf)
        }
        return asw.map { mapper.mapFromModel(it) }
    }


    private fun getFieldsFromGsonString(): List<FormResponse.Data.Field> {
        val gson = Gson()
        val formResponse = gson.fromJson(RESPONSE_FORM_WITH_NO_SECTION, FormResponse::class.java)
        return formResponse.data.fields
    }

    private fun getFieldsAfterAddNodeChildrenToParent(): MutableList<FormResponse.Data.Field> {
        val fieldsAfterMapping = mutableListOf<FormResponse.Data.Field>()
        fieldsAfterMapping.addAll(getFieldsFromGsonString())
        for (field in fieldsAfterMapping) {
            field.childFields = mutableListOf()
            if (field.conditionalView != null) {
                if (field.conditionalView.conditions != null) {
                    if (field.conditionalView.conditions.isNotEmpty()) {
                        for (otherFields in fieldsAfterMapping) {
                            for (condition in field.conditionalView.conditions) {
                                if (otherFields.id == condition.linkedFieldId)
                                    otherFields.childFields?.add(field.id)
                            }
                        }
                    }
                }
            }
        }
        return fieldsAfterMapping
    }
}