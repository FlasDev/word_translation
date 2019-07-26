package com.example.englishtranslationword.screen.add_word


import com.example.englishtranslationword.R
import com.example.englishtranslationword.databinding.FragmentAddWordBinding
import com.example.englishtranslationword.screen.base.BaseFragment


class AddWordFragment : BaseFragment<FragmentAddWordBinding>() {

    override val layout: Int = R.layout.fragment_add_word

    companion object {
        fun newInstance() = AddWordFragment()
    }
}
