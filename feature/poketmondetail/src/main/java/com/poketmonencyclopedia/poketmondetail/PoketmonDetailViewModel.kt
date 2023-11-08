package com.poketmonencyclopedia.poketmondetail

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.poketmonencyclopedia.domain.detail.DetailResponse
import com.poketmonencyclopedia.domain.detail.PoketmonDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PoketmonDetailViewModel @Inject constructor(
    private val poketmonDetailUseCase: PoketmonDetailUseCase
) : ViewModel() {
    private val state = MutableStateFlow<HomeMainFragmentState>(HomeMainFragmentState.Init)
    val mState: StateFlow<HomeMainFragmentState> get() = state

    init {
        fetchAllMyProducts()
    }

    fun fetchAllMyProducts(){
        viewModelScope.launch {
            poketmonDetailUseCase.getPoketmonDetail()
                .onEach {
                    state.value = HomeMainFragmentState.IsLoading(true)
                }
                .catch { exception ->
                    Log.d("exception: ", exception.message.toString())
                }
                .collect { result ->
                    state.value = HomeMainFragmentState.Detail(result)
                }
        }
    }
}

// TODO : 리팩토링, 설계
sealed class HomeMainFragmentState {
    object Init : HomeMainFragmentState()
    data class IsLoading(val isLoading: Boolean) : HomeMainFragmentState()
    data class Detail(val message : DetailResponse) : HomeMainFragmentState()
}