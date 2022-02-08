package com.check.cache.db.dao

import android.provider.SyncStateContract.Helpers.insert
import androidx.lifecycle.LiveData
import androidx.room.*
import com.check.cache.db.FieldDataBase
import com.check.cache.db.entities.FieldCacheEntity

@Dao
interface FieldDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFields(fields:FieldCacheEntity)



//    @Update
//    suspend fun updateFields(fields:FieldCacheEntity)
//
//    @Query("SELECT * FROM Field")
//    suspend fun getAllFields(): LiveData<List<FieldCacheEntity>>
}