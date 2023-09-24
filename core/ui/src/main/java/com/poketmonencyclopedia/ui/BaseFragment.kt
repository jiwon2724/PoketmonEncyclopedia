package com.poketmonencyclopedia.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<T : ViewBinding> :Fragment() {
    private var _binding: T? = null
    val binding: T get() = _binding ?: error("binding not initialized yet")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingFactory(inflater, container)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    abstract fun bindingFactory(inflater: LayoutInflater, parent: ViewGroup?): T
    open fun initViews() { }
}