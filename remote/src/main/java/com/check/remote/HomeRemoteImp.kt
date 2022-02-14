package com.check.remote

//import com.check.core.base.TestResponse.NEW_RESPONSE
import com.check.core.base.TestResponse.RESPONSE_FORM_WITH_NO_SECTION
import com.check.data.models.newestrespone.NewFieldEntity
import com.check.data.models.newestrespone.WorkItemEntity
import com.check.data.remote.FormRemote
import com.check.remote.mapper.newmapper.WorkItemMapper
import com.check.remote.model.newestresponse.NewResponse
import com.check.remote.model.newestresponse.WorkItem
import com.google.gson.Gson
import io.reactivex.Single
import java.util.*

class HomeRemoteImp(
    private val workItemMapper: WorkItemMapper
) : FormRemote {
//    override fun getForm(): List<Field> {
//        val result = getFieldsAfterAddNodeChildrenToParent()
//        val obj = result[6]
//        repeat(100000) {
//            result.add(obj)
//        }
//        return result.map { mapper.mapFromModel(it) }
//    }

    override fun getWorkItem(): WorkItemEntity {
        val obj = workItemMapper.mapFromModel(getNewResponse())
        val test = obj.fields[6]
        for (item in 0..10000) {
            val wsw = NewFieldEntity(
                test.arLabel,
                test.arPlaceholder,
                test.conditionalView,
                test.controlType,
                test.enLabel,
                test.enPlaceholder,
                test.fieldOrder,
                test.hasAttachments,
                test.hasNotes,
                item.toString(),
                test.regex,
                test.required,
                test.responsibleUnit,
                test.sectionId,
                test.severityLevel,
                test.templateQuestionId,
                test.visibilityView,
                test.values,
                test.workItemId
            )
            obj.fields.add(wsw)
        }
        return obj

    }


//    private fun getFieldsFromGsonString(): List<Field> {
//        val gson = Gson()
//        val formResponse = gson.fromJson(RESPONSE_FORM_WITH_NO_SECTION, FormResponse::class.java)
//        return formResponse.data.fields
//    }

    private fun getNewResponse(): WorkItem? {
        val gson = Gson()
        val result = gson.fromJson(RESPONSE_FORM_WITH_NO_SECTION, NewResponse::class.java)
        return result.workItem
    }

//    private fun getFieldsAfterAddNodeChildrenToParent(): MutableList<FormResponse.Data.Field> {
//        val fieldsAfterMapping = mutableListOf<FormResponse.Data.Field>()
//        fieldsAfterMapping.addAll(getFieldsFromGsonString())
//        for (field in fieldsAfterMapping) {
//            field.childFields = mutableListOf()
//            if (field.conditionalView != null) {
//                if (field.conditionalView.conditions != null) {
//                    if (field.conditionalView.conditions.isNotEmpty()) {
//                        for (otherFields in fieldsAfterMapping) {
//                            for (condition in field.conditionalView.conditions) {
//                                if (otherFields.id == condition.linkedFieldId)
//                                    otherFields.childFields?.add(field.id)
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return fieldsAfterMapping
//    }
}