package com.check.data.mapper.newmapper

import com.check.data.mapper.Mapper
import com.check.data.models.newestrespone.CampaignEntity
import com.check.domain.models.newestresponse.Campaign

class CampaignMapper(
    private val headerMapper: HeaderMapper,
) : Mapper<CampaignEntity, Campaign> {
    override fun mapFromEntity(type: CampaignEntity?): Campaign {
        return Campaign(
            headerMapper.mapFromEntity(type?.header)
        )
    }

    override fun mapToEntity(type: Campaign?): CampaignEntity {
        return CampaignEntity(
            headerMapper.mapToEntity(type?.header)
        )
    }

}