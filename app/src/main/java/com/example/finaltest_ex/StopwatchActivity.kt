package com.example.finaltest_ex

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.finaltest_ex.databinding.ActivityStopwatchBinding

class StopwatchActivity : AppCompatActivity() {
    lateinit var binding: ActivityStopwatchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStopwatchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "스톱워치"
    }
}