package com.check.remote.mapper

interface ResponseMapper<M, E> {
    fun mapFromModel(model: M?): E
}