package com.check.fullcycklepoc.di

import androidx.room.Room
import com.check.cache.db.CacheImp
import com.check.cache.db.FieldDataBase
import com.check.cache.db.base.mapper.*
import com.check.cache.db.dao.FieldDao
import com.check.data.cache.FormCache
import com.check.data.mapper.newmapper.ConditionMapper
import com.check.data.mapper.newmapper.ConditionalViewMApper
import com.check.data.mapper.newmapper.HeaderMapper
import com.check.data.mapper.newmapper.SubmissionMessageMapper
import com.check.data.remote.FormRemote
import com.check.data.repository.FormRepositoryImp
import com.check.domain.repository.FormRepository
import com.check.domain.usecase.FormUseCase
import com.check.remote.HomeRemoteImp
import com.check.remote.mapper.ConditionResponseMapper
import com.check.remote.mapper.ConditionViewResponseMapper
import com.check.remote.mapper.newmapper.*
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {
    single { ConditionMapper() }
    single { ConditionalViewMApper(get()) }
    single { ConditionViewResponseMapper(get()) }
    single { ConditionResponseMapper() }




    single { HeaderMapper() }
    single { com.check.data.mapper.newmapper.NewFieldMapper(get()) }



    single { com.check.data.mapper.newmapper.CampaignMapper(get()) }



    single { SubmissionMessageMapper() }
    single { com.check.remote.mapper.newmapper.SubmissionMessageMapper() }

    single { com.check.data.mapper.newmapper.WorkItemMapper(get(), get()) }







    single { HeaderCacheEntityMapper() }
    single { CampaignCacheEntityMapper(get()) }
    single { WorkItemCachEntityMapper(get()) }
    single { ConditionCacheEntityMapper() }
    single { ConditionalViewCacheEntityMapper(get()) }
    single { FieldCacheEntityMapper(get()) }
    single<FormCache> { CacheImp(get(), get(), get()) }
    single { com.check.remote.mapper.newmapper.ConditionMapper() }
    single { ConditionalViewMapper(get()) }
    single { NewFieldMapper(get()) }
    single { com.check.remote.mapper.newmapper.HeaderMapper() }
    single { CampaignMapper(get()) }
    single { WorkItemMapper(get(), get()) }
    single<FormRemote> { HomeRemoteImp(get()) }
    single<FormRepository> { FormRepositoryImp(get(), get(), get(),get()) }
    single { FormUseCase(get()) }





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