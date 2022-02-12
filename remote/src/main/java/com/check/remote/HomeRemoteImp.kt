package com.check.remote

//import com.check.core.base.TestResponse.NEW_RESPONSE
import com.check.core.base.TestResponse.RESPONSE_FORM_WITH_NO_SECTION
import com.check.data.models.newestrespone.WorkItemEntity
import com.check.data.remote.FormRemote
import com.check.remote.mapper.newmapper.WorkItemMapper
import com.check.remote.model.newestresponse.NewResponse
import com.check.remote.model.newestresponse.WorkItem
import com.google.gson.Gson
import io.reactivex.Single

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

    override fun getWorkItem(): Single<WorkItemEntity> {
        return Single.defer {
            Single.just(workItemMapper.mapFromModel(getNewResponse()))
        }
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