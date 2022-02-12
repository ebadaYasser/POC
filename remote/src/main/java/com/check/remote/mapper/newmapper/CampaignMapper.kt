package com.check.remote.mapper.newmapper

import com.check.data.models.newestrespone.CampaignEntity
import com.check.remote.mapper.ResponseMapper
import com.check.remote.model.newestresponse.Campaign

class CampaignMapper(
    private val headerMapper: HeaderMapper
) : ResponseMapper<Campaign, CampaignEntity> {
    override fun mapFromModel(model: Campaign?): CampaignEntity {
        return CampaignEntity(
            headerMapper.mapFromModel(model?.header))
    }
}