package com.poketmonencyclopedia.poketmondetail

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.poketmonencyclopedia.feature.poketmondetail.databinding.FragmentPoketmonDetailBinding
import com.poketmonencyclopedia.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PoketmonDetailFragment : BaseFragment<FragmentPoketmonDetailBinding>() {
    private val poketmonDetailViewModel: PoketmonDetailViewModel by viewModels()

    override fun bindingFactory(inflater: LayoutInflater, parent: ViewGroup?): FragmentPoketmonDetailBinding {
        return FragmentPoketmonDetailBinding.inflate(
            inflater,
            parent,
            false
        )
    }

    override fun initViews() {
        Log.d("initViews : ", "test")
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                poketmonDetailViewModel.getPoketmonDetail()
            }
        }
    }
}