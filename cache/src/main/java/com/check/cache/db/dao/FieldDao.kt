package com.check.cache.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.check.cache.db.entities.FieldCacheEntity

@Dao
interface FieldDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertFields(fields: FieldCacheEntity)


//    @Update
//    suspend fun updateFields(fields:FieldCacheEntity)
//
//    @Query("SELECT * FROM Field")
//    suspend fun getAllFields(): LiveData<List<FieldCacheEntity>>
}