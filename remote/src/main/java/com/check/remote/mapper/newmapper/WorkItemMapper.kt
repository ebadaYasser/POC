package com.check.remote.mapper.newmapper

import com.check.data.models.newestrespone.NewFieldEntity
import com.check.data.models.newestrespone.WorkItemEntity
import com.check.remote.mapper.ResponseMapper
import com.check.remote.model.newestresponse.WorkItem

class WorkItemMapper(
    private val camPainMapper: CampaignMapper,
    private val newFieldMapper: NewFieldMapper,
) : ResponseMapper<WorkItem, WorkItemEntity> {
    override fun mapFromModel(model: WorkItem?): WorkItemEntity {
        return WorkItemEntity(
            camPainMapper.mapFromModel(model?.campaign),
            model?.fields?.map { newFieldMapper.mapFromModel(it) } as MutableList<NewFieldEntity>,
            model.id,
            model.score,
            model.templateId,
            model.themeId
        )
    }

}