package com.check.domain.usecase

import com.check.domain.models.Field
import com.check.domain.repository.FormRepository

class FormUseCase(private val formRepository: FormRepository) {
    fun getForm() = formRepository.getForm()
    fun saveDateInCache(field: Field) = formRepository.saveDataToCache(field)
}