package com.check.fullcycklepoc.ui.adapter

import com.check.domain.models.newestresponse.NewField


interface OnParentChanges {
    fun onParentChanges(parentField: NewField)
}