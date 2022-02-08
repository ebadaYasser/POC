package com.check.cache.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.check.cache.db.dao.FieldDao
import com.check.cache.db.entities.FieldCacheEntity

@Database(entities = [FieldCacheEntity::class],version = 1)
@TypeConverters(Converters::class)
abstract class FieldDataBase :RoomDatabase() {

//    abstract val fieldDAO : FieldDao

    abstract fun getRunDao(): FieldDao


    companion object{
        @Volatile
        private var INSTANCE : FieldDataBase? = null
        fun getInstance(context: Context):FieldDataBase{
            synchronized(this){
                var instance = INSTANCE
                if(instance==null){
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



