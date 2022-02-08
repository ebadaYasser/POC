package com.check.fullcycklepoc.di

import com.check.presenter.FormViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { FormViewModel(get()) }
}