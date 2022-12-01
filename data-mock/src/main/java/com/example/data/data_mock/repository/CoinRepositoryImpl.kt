package com.example.data.data_mock.repository

import com.example.domain.model.Coin
import com.example.domain.repository.CoinRepository
import dagger.Module
import javax.inject.Inject
@Module
class CoinRepositoryImpl @Inject constructor() : CoinRepository {

    val coinList = arrayListOf(
        Coin("1", false, "Bitcoin", 12, "BTC"),
        Coin("2", true, "Dogecoin", 12, "DOGE")
    )

    override suspend fun getCoins(): List<Coin> = coinList
}