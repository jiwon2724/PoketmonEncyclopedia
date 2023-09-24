package com.poketmonencyclopedia.poketmonlist

import android.view.LayoutInflater
import android.view.ViewGroup
import com.poketmonencyclopedia.feature.poketmonlist.databinding.FragmentPoketmonListBinding
import com.poketmonencyclopedia.ui.BaseFragment

class PoketmonListFragment : BaseFragment<FragmentPoketmonListBinding>() {
    override fun bindingFactory(inflater: LayoutInflater, parent: ViewGroup?): FragmentPoketmonListBinding {
        return FragmentPoketmonListBinding.inflate(
            inflater,
            parent,
            false
        )
    }

    override fun initViews() {

    }
}