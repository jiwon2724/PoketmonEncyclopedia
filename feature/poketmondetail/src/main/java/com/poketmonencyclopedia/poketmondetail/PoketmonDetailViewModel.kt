package com.poketmonencyclopedia.poketmondetail

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.poketmonencyclopedia.domain.detail.PoketmonDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PoketmonDetailViewModel @Inject constructor(
    private val poketmonDetailUseCase: PoketmonDetailUseCase
) : ViewModel() {
    suspend fun getPoketmonDetail() {
        viewModelScope.launch {
            Log.d("viewModelScope test", "test")
            val result = poketmonDetailUseCase.getPoketmonDetail()
            result.collect {
                Log.d("getPoketmonDetail : ", it.toString())
            }
        }
    }
}