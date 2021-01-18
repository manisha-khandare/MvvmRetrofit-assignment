package com.example.mvvmretrofitapplication

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.mvvmretrofitapplication.data.api.ApiHelper
import com.example.mvvmretrofitapplication.data.api.ApiService
import com.example.mvvmretrofitapplication.data.repository.MainRepository
import com.example.mvvmretrofitapplication.ui.main.viewmodel.MainViewModel
import com.example.mvvmretrofitapplication.utils.Resource
import com.example.mvvmretrofitapplication.utils.TestCoroutineRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class SingleNetworkCallViewModelTest {

    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()

    @Mock
    private lateinit var apiHelper: ApiHelper

    @Mock
    private lateinit var mainRepository: MainRepository

    @Mock
    private lateinit var apiUsersObserver: Observer<Resource<ApiService>>

    @Before
    fun setUp() {
        // do something if required
    }

    @Test
    fun givenServerResponse200_whenFetch_shouldReturnSuccess() {
        testCoroutineRule.runBlockingTest {
            Mockito.doReturn(emptyList<ApiService>())
                .`when`(apiHelper)
                .getMyData()
            val viewModel = MainViewModel(mainRepository)
            viewModel.getMyData()
            Mockito.verify(apiHelper).getMyData()
           // Mockito.verify(apiUsersObserver).onChanged(Resource.success(emptyList()))
          //  viewModel.getMyData().removeObserver(apiUsersObserver)
        }
    }

    @After
    fun tearDown() {
        // do something if required
    }
}