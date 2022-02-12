package com.check.remote.mapper.newmapper

import com.check.data.models.newestrespone.HeaderEntity
import com.check.remote.mapper.ResponseMapper
import com.check.remote.model.newestresponse.Header

class HeaderMapper : ResponseMapper<Header, HeaderEntity> {
    override fun mapFromModel(model: Header?): HeaderEntity {
        return HeaderEntity(
            model?.description,
            model?.logo,
            model?.showQuestionCount,
            model?.title
        )
    }
}