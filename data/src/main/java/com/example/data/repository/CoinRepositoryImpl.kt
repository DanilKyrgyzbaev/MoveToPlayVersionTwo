package com.example.data.repository

import com.example.data.api.Api
import com.example.data.extensions.toCoin
import com.example.domain.model.Coin
import com.example.domain.repository.CoinRepository
import javax.inject.Inject
class CoinRepositoryImpl @Inject constructor(private val api: Api) : CoinRepository {
    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map { it.toCoin() }
    }
}
