package com.example.data.extensions

import com.example.domain.model.Coin
import com.example.data.model.Model

fun Model.toCoin(): Coin {
    return Coin(
        id,
        isActive,
        name,
        rank,
        symbol
    )
}
