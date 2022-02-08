package com.check.presenter

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

open class BaseViewModel : ViewModel() {
    protected val compositeDisposable: CompositeDisposable = CompositeDisposable()
    override fun onCleared() {
        releaseObjects()
    }

    private fun releaseObjects() {
        if (!compositeDisposable.isDisposed)
            compositeDisposable.clear()
    }
}