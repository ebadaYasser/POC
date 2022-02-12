package com.check.data.mapper.newmapper

import com.check.data.mapper.Mapper
import com.check.data.models.newestrespone.WorkItemEntity
import com.check.domain.models.newestresponse.WorkItem

class WorkItemMapper(
    private val campaignMapper: CampaignMapper,
    private val newFieldMapper: NewFieldMapper,
) : Mapper<WorkItemEntity, WorkItem> {
    override fun mapFromEntity(type: WorkItemEntity?): WorkItem {
        return WorkItem(
            campaignMapper.mapFromEntity(type?.campaign),
            type?.fields?.map { newFieldMapper.mapFromEntity(it) },
            type?.id,
            type?.score,
            type?.templateId,
            type?.themeId
        )
    }

    override fun mapToEntity(type: WorkItem?): WorkItemEntity {
        return WorkItemEntity(
            campaignMapper.mapToEntity(type?.campaign),
            type?.fields?.map { newFieldMapper.mapToEntity(it) },
            type?.id,
            type?.score,
            type?.templateId,
            type?.themeId
        )
    }
}