package com.check.domain.usecase

import com.check.domain.models.newestresponse.NewField
import com.check.domain.models.newestresponse.WorkItem
import com.check.domain.repository.FormRepository

class FormUseCase(private val formRepository: FormRepository) {
    fun getWorkItem() = formRepository.getWorkItems()
    fun saveWorkItem(workItem: WorkItem) = formRepository.saveWorkItem(workItem)
    fun saveForm(form: List<NewField>) = formRepository.saveForm(form)
    fun saveValue(
        values: MutableList<String>?,
        formId: String?,
        fieldId: String?
    ) = formRepository.saveValue(values, formId, fieldId)
}