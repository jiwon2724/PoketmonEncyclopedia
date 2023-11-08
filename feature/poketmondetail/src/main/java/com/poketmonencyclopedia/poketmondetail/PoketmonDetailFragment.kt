package com.poketmonencyclopedia.poketmondetail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.poketmonencyclopedia.feature.poketmondetail.databinding.FragmentPoketmonDetailBinding
import com.poketmonencyclopedia.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
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
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                poketmonDetailViewModel.mState.collectLatest {
                    when(it) {
                        is HomeMainFragmentState.Detail -> { }
                        else -> { }
                    }
                }
            }
        }
    }
}