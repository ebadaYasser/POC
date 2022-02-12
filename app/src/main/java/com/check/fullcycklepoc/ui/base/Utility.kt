package com.check.fullcycklepoc.ui.base

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Context
import android.widget.DatePicker
import android.widget.EditText
import com.check.domain.models.newestresponse.NewField
import java.util.*


@SuppressLint("SetTextI18n") fun Context.openCalendarAndSetTextInResult(
  parentField: NewField,

  textBox: EditText,
  action: (NewField) -> Unit
) {
  val c = Calendar.getInstance()
  val currentYear = c.get(Calendar.YEAR)
  val currentMonth = c.get(Calendar.MONTH)
  val currentDay = c.get(Calendar.DAY_OF_MONTH)
  val dpd = DatePickerDialog(
    this,
    DatePickerDialog.OnDateSetListener { _: DatePicker?, year: Int, month: Int, dayOfMonth: Int ->
      textBox.setText(
        year.toString() + "/" + (month + 1).toString() + "/" + dayOfMonth.toString()
      )
      if (parentField.values == null)
        parentField.values = mutableListOf()

      parentField.values?.add(
        year.toString() + "/" + (month + 1).toString() + "/" + dayOfMonth.toString()
      )
      action(parentField)

    }, currentYear, currentMonth, currentDay
  )
  dpd.show()
}
