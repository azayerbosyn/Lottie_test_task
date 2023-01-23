package com.example.lottie_test_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lottie_test_task.databinding.ActivityMainBinding
import com.airbnb.lottie.LottieDrawable


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupAnim()
    }

    private fun setupAnim() {
        binding.animationView.setAnimation(R.raw.typing)
        binding.animationView.repeatCount = LottieDrawable.INFINITE
        binding.animationView.playAnimation()
    }
}