package com.yuriysurzhikov.nasaapplication.repository.retrofit.dailypost

import com.yuriysurzhikov.nasaapplication.model.DailyPost
import com.yuriysurzhikov.nasaapplication.utils.EntityMapper
import javax.inject.Inject

class DailyPostNetworkMapper @Inject constructor(): EntityMapper<DailyPostNetworkEntity, DailyPost> {
    override fun mapFromEntity(entity: DailyPostNetworkEntity): DailyPost {
        return DailyPost(
            entity.date,
            entity.explanation,
            entity.hdUrl,
            entity.title
        )
    }

    override fun mapToEntity(domainModel: DailyPost): DailyPostNetworkEntity {
        return DailyPostNetworkEntity(
            domainModel.date,
            domainModel.explanation,
            domainModel.hdUrl,
            domainModel.title
        )
    }

    fun mapFromEntityList(entities: List<DailyPostNetworkEntity>): List<DailyPost> {
        return entities.map { mapFromEntity(it) }
    }
}