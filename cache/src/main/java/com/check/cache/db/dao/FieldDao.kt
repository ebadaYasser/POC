package com.check.cache.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.check.cache.db.entities.FieldCacheEntity

@Dao
interface FieldDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFields(fields: FieldCacheEntity)

    @Query("SELECT * FROM Field WHERE formId= :fieldId")
    fun getAllFields(fieldId: String): List<FieldCacheEntity?>?
}