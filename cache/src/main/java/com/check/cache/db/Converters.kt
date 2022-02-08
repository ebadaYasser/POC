package com.check.cache.db

import androidx.room.TypeConverter
import com.check.data.models.ConditionEntity
import com.check.data.models.ConditionalViewEntity

class Converters {
    @TypeConverter
    fun fromConditionalView(source: ConditionalViewEntity):String{
           return source.action.toString()
    }
    @TypeConverter
    fun toConditionalView(action:String):ConditionalViewEntity{
        return ConditionalViewEntity(action,null,null,null)
    }
}
