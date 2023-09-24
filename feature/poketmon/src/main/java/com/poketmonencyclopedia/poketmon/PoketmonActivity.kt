package com.poketmonencyclopedia.poketmon

import com.poketmonencyclopedia.feature.poketmon.databinding.ActivityPoketmonBinding
import com.poketmonencyclopedia.ui.BaseActivity

class PoketmonActivity : BaseActivity<ActivityPoketmonBinding>() {
    override fun bindingFactory() = ActivityPoketmonBinding.inflate(layoutInflater)
    override fun initView() {

    }
}