package com.check.cache.db.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.check.cache.db.entities.FieldCacheEntity
import com.check.cache.db.entities.WorkItemCacheEntity

data class WorkItemAndForm(
    @Embedded
    val workItemCacheEntity: WorkItemCacheEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "workItemId"
    )
    val fieldCacheEntity: FieldCacheEntity
)
