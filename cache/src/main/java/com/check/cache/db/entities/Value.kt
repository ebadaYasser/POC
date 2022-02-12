package com.check.cache.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Value(
    var values: MutableList<String>?,
    var formId: String?,
    @PrimaryKey(autoGenerate = false)
    var fieldId: String
)
