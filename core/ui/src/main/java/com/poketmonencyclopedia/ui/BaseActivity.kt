package com.poketmonencyclopedia.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T : ViewBinding> : AppCompatActivity() {
    protected val binding: T by lazy(LazyThreadSafetyMode.NONE) { bindingFactory() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    abstract fun bindingFactory(): T
    abstract fun initView()
}