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

    @Query("SELECT * FROM Field WHERE id='0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72'")
    suspend fun getAllFields():List<FieldCacheEntity?>?
}