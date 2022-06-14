package com.exxuslee.data.mapper

import com.exxuslee.data.remote.response.CurrencyResponse
import com.exxuslee.domain.models.Symbols


/**
 * Created by Exxus Lee on 24/07/2020.
 */

class CurrencyMapperRemote : BaseMapperRepository<CurrencyResponse, Symbols> {
    override fun transform(type: CurrencyResponse): Symbols = Symbols(
        symbols = type.symbols,
        favorite = arrayListOf(),
        base = ""
    )

    override fun transformToRepository(type: Symbols): CurrencyResponse = CurrencyResponse(
        symbols = type.symbols
    )
}