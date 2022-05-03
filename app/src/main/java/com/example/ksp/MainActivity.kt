package com.example.ksp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.functionprocessor.Function
import java.io.OutputStream

class MainActivity : AppCompatActivity(), MyFunction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

@Function("MyGenFunction")
interface MyFunction

fun main() {
    println("Hello world")
}