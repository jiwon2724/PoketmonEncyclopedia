package com.poketmonencyclopedia.poketmon

import androidx.fragment.app.Fragment
import com.poketmonencyclopedia.feature.poketmon.R
import com.poketmonencyclopedia.feature.poketmon.databinding.ActivityPoketmonBinding
import com.poketmonencyclopedia.poketmondetail.PoketmonDetailFragment
import com.poketmonencyclopedia.poketmonlist.PoketmonListFragment
import com.poketmonencyclopedia.ui.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import com.poketmonencyclopedia.ui.R as UI

@AndroidEntryPoint
class PoketmonActivity : BaseActivity<ActivityPoketmonBinding>() {
    override fun bindingFactory() = ActivityPoketmonBinding.inflate(layoutInflater)
    override fun initView() {
        // TODO : 데이터 매핑 후 개선
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when(item.itemId) {
                UI.id.detail -> replaceFragment(PoketmonDetailFragment())
                else -> replaceFragment(PoketmonListFragment())
            }
            return@setOnItemSelectedListener true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.bottomNavigationView, fragment)
        fragmentTransaction.commit()
    }
}