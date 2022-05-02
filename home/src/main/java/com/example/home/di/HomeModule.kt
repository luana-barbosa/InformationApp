package com.example.home.di

import com.example.home.data.repository.AppHomeRepository
import com.example.home.data.repository.HomeRepository
import com.example.home.domain.GetHomeInformation
import com.example.home.domain.GetHomeInformationUseCase
import com.example.home.service.HomeApi
import com.example.home.ui.HomeInformationViewModel
import com.example.network.retrofit.NetworkInicialization
import org.koin.dsl.module

val homeModule = module {
    single { NetworkInicialization().createService(HomeApi::class.java) }
    single <HomeRepository> { AppHomeRepository(get()) }
    single<GetHomeInformationUseCase> { GetHomeInformation(get()) }
    single { HomeInformationViewModel(get()) }
}
