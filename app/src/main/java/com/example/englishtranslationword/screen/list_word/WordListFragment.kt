package com.example.englishtranslationword.screen.list_word


import com.example.englishtranslationword.R
import com.example.englishtranslationword.databinding.FragmentWordListBinding
import com.example.englishtranslationword.screen.base.BaseFragment


class WordListFragment : BaseFragment<FragmentWordListBinding>() {

    override val layout: Int = R.layout.fragment_word_list

    companion object {
        fun newInstance() = WordListFragment()
    }
}
