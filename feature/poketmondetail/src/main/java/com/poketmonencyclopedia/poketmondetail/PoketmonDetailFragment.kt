package com.poketmonencyclopedia.poketmondetail

import android.view.LayoutInflater
import android.view.ViewGroup
import com.poketmonencyclopedia.feature.poketmondetail.databinding.FragmentPoketmonDetailBinding
import com.poketmonencyclopedia.ui.BaseFragment

class PoketmonDetailFragment : BaseFragment<FragmentPoketmonDetailBinding>() {
    override fun bindingFactory(inflater: LayoutInflater, parent: ViewGroup?): FragmentPoketmonDetailBinding {
        return FragmentPoketmonDetailBinding.inflate(
            inflater,
            parent,
            false
        )
    }

    override fun initViews() {

    }
}