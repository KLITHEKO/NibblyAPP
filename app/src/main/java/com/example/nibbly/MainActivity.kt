package com.example.nibbly

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nibbly.databinding.ActivityMainBinding


/**
 * The MainActivity serves as the entry point of the application, managing the
 * user interface lifecycle and navigation (Google, 2026).
 */
class MainActivity : AppCompatActivity() {

    // ViewBinding is used to access layout views in a type-safe and null-safe way (Google, 2026)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Using ViewBinding

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //An OnClickListener is attached to the button to trigger navigation.

        binding.startQuizButton.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
    }
}
