package com.check.data.mapper.newmapper

import com.check.data.mapper.Mapper
import com.check.data.models.newestrespone.HeaderEntity
import com.check.domain.models.newestresponse.Header

class HeaderMapper : Mapper<HeaderEntity, Header> {
    override fun mapFromEntity(type: HeaderEntity?): Header {
        return Header(
            type?.description,
            type?.logo,
            type?.showQuestionCount,
            type?.title
        )
    }

    override fun mapToEntity(type: Header?): HeaderEntity {
        return HeaderEntity(
            type?.description,
            type?.logo,
            type?.showQuestionCount,
            type?.title
        )
    }
}
