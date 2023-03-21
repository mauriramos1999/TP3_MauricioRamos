package com.example.pil_hello_world_mvp

import com.example.pil_hello_world_mvp.databinding.ActivityMainBinding

interface WriterContract {

    interface Presenter{
        fun onButtonPressed()
    }

    interface View{
        fun onButtonClicked(onClick: () -> Unit)
        fun showToast(message: String)
        fun getBinding(): ActivityMainBinding
    }
}