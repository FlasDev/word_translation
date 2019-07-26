package com.example.englishtranslationword.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.englishtranslationword.screen.add_word.AddWordFragment
import com.example.englishtranslationword.screen.list_word.WordListFragment

class ViewPagerStateAdapter(context: FragmentActivity
) : FragmentStateAdapter(context) {

    val list = listOf(AddWordFragment.newInstance(), WordListFragment.newInstance())

    override fun getItemCount(): Int = 2


    override fun createFragment(position: Int): Fragment {
        return list[position]
    }

}