package com.check.cache.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.check.cache.db.convertors.Convertors
import com.check.cache.db.dao.FieldDao
import com.check.cache.db.entities.FieldCacheEntity
import com.check.cache.db.entities.Value
import com.check.cache.db.entities.WorkItemCacheEntity

@Database(
    entities = [WorkItemCacheEntity::class, FieldCacheEntity::class, Value::class],
    version = 1
)
@TypeConverters(Convertors::class)
abstract class FieldDataBase : RoomDatabase() {

    abstract fun getRunDao(): FieldDao


    companion object {
        @Volatile
        private var INSTANCE: FieldDataBase? = null
        fun getInstance(context: Context): FieldDataBase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        FieldDataBase::class.java,
                        "field_data_database"
                    ).build()
                }
                return instance
            }
        }

    }
}




