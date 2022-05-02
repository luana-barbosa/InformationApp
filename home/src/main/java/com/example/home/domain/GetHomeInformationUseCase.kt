package com.example.home.domain

import com.example.home.data.repository.HomeRepository
import com.example.home.data.response.HomeInformationModel
import com.example.home.data.response.InformationListResponse

interface GetHomeInformationUseCase {
    suspend operator fun invoke(): InformationListResponse
}

class GetHomeInformation(private val repository: HomeRepository) : GetHomeInformationUseCase {
    override suspend fun invoke(): InformationListResponse =
        repository.getHomeInformation()
}
