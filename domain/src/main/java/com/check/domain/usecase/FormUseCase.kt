package com.check.domain.usecase

import com.check.domain.models.Field
import com.check.domain.repository.FormRepository

class FormUseCase(private val formRepository: FormRepository) {
    fun getForm() = formRepository.getForm()
     fun saveDateInCache(fields: List<Field>){
        /**
         * passing this lis to data module
         * then to caching module after transform into json string and save into Room DB
         * */

//        formRepository.saveDataToCache(fields[0])
    }
}