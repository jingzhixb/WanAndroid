package com.jz.core

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

 abstract class BaseActivity : AppCompatActivity(),Ilce {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}