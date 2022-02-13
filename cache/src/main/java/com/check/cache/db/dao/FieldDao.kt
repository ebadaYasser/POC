package com.check.cache.db.dao

import androidx.room.*
import com.check.cache.db.entities.FieldCacheEntity
import com.check.cache.db.entities.Value
import com.check.cache.db.entities.WorkItemCacheEntity
import com.check.cache.db.relation.WorkItemAndForm

@Dao
interface FieldDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveWorkItem(workItemCacheEntity: WorkItemCacheEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveForm(fieldCacheEntity: List<FieldCacheEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveValue(value: Value)

    @Query("SELECT *FROM work_item WHERE id = :formId")
    fun getWorkItemAndForm(formId: String): List<WorkItemAndForm>
}