package com.check.remote.mapper.newmapper

import com.check.data.models.newestrespone.SubmissionMessageEntity
import com.check.remote.mapper.ResponseMapper
import com.check.remote.model.newestresponse.SubmissionMessage

class SubmissionMessageMapper : ResponseMapper<SubmissionMessage, SubmissionMessageEntity> {
    override fun mapFromModel(model: SubmissionMessage?): SubmissionMessageEntity {
        return SubmissionMessageEntity(
            model?.description,
            model?.logo,
            model?.showQuestionCount,
            model?.title
        )
    }
}