package com.check.fullcycklepoc.ui.adapter

import com.check.domain.models.Field


interface OnParentChanges {
    // suspend fun onParentChanges(parentField :Field)
    fun onParentChanges(parentField: Field)
}