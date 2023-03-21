package com.example.pil_hello_world_mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pil_hello_world_mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var writerPresenter: WriterPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        writerPresenter = WriterPresenter(WriterView(this))
    }
}