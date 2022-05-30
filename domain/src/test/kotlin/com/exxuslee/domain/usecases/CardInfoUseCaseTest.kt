package com.exxuslee.domain.usecases

import com.exxuslee.domain.repositories.PriceRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by Mayokun Adeniyi on 24/07/2020.
 */

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class CardInfoUseCaseTest {

    // region helper fields
    @Mock
    private lateinit var cardInfoRepository: PriceRepository
    private lateinit var getCardInfo: GetCardInfoUseCaseImpl
    private val getFromRemote: Boolean = false
    // endregion helper fields

    @Before
    fun setUp(){
        getCardInfo = GetCardInfoUseCaseImpl(cardInfoRepository)
    }

    @Test
    fun getCardInfoUseCase_calls_cardInfoRepository(){
        runBlockingTest {
            getCardInfo(getFromRemote)
            Mockito.verify(cardInfoRepository).getPrice(getFromRemote)
        }
    }
}