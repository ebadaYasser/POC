package com.check.data.mapper.newmapper

import com.check.data.mapper.Mapper
import com.check.data.models.newestrespone.SubmissionMessageEntity
import com.check.domain.models.newestresponse.SubmissionMessage

class SubmissionMessageMapper : Mapper<SubmissionMessageEntity, SubmissionMessage> {
    override fun mapFromEntity(type: SubmissionMessageEntity?): SubmissionMessage {
        return SubmissionMessage(
            type?.description,
            type?.logo,
            type?.showQuestionCount,
            type?.title
        )
    }

    override fun mapToEntity(type: SubmissionMessage?): SubmissionMessageEntity {
        return SubmissionMessageEntity(
            type?.description,
            type?.logo,
            type?.showQuestionCount,
            type?.title
        )
    }
}