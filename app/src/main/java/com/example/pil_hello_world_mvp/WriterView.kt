package com.example.pil_hello_world_mvp

import android.app.Activity
import android.widget.Toast
import com.example.pil_hello_world_mvp.databinding.ActivityMainBinding

class WriterView(private var activity: Activity): WriterContract.View, ActivityView(activity) {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }
    override fun onButtonClicked(onClick: () -> Unit){
        binding.button.setOnClickListener{onClick()}
    }

    override fun showToast(message: String){
        Toast.makeText(activity.applicationContext, message, Toast.LENGTH_SHORT).show()

    }
    override fun getBinding(): ActivityMainBinding{
        return binding
    }
}