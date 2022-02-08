package com.check.fullcycklepoc.di

import androidx.room.Room
import com.check.MainApp
import com.check.cache.db.CacheImp
import com.check.cache.db.FieldDataBase
import com.check.cache.db.base.mapper.ConditionCacheEntityMapper
import com.check.cache.db.base.mapper.ConditionalViewCacheEntityMapper
import com.check.cache.db.base.mapper.FieldCacheEntityMapper
import com.check.cache.db.dao.FieldDao
import com.check.data.cache.FormCache
import com.check.data.mapper.ConditionMapper
import com.check.data.mapper.ConditionalViewMApper
import com.check.data.mapper.FieldMapper
import com.check.data.remote.FormRemote
import com.check.data.repository.FormRepositoryImp
import com.check.domain.repository.FormRepository
import com.check.domain.usecase.FormUseCase
import com.check.remote.HomeRemoteImp
import com.check.remote.mapper.ConditionResponseMapper
import com.check.remote.mapper.ConditionViewResponseMapper
import com.check.remote.mapper.FieldResponseMapper
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {
    single { ConditionMapper() }
    single { ConditionalViewMApper(get()) }
    single { FieldMapper(get()) }
    single { ConditionViewResponseMapper(get()) }
    single { FieldResponseMapper(get()) }
    single { ConditionResponseMapper() }
    single<FormRemote> { HomeRemoteImp(get()) }
    single<FormRepository> { FormRepositoryImp(get(), get(),get()) }

    single<FormCache> { CacheImp(get(),get()) }

    single { FormUseCase(get()) }
    single { ConditionalViewCacheEntityMapper(get()) }
    single { FieldCacheEntityMapper(get()) }

    single { ConditionCacheEntityMapper() }

//    single { FieldDataBase.getInstance(androidContext()) }
    single {
        Room.databaseBuilder(
            androidContext(),
            FieldDataBase::class.java,
            "field_data_database"
        ).build()
    }

    single<FieldDao> {
        val database = get<FieldDataBase>()
        database.getRunDao()
    }









}