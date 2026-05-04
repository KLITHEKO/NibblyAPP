package com.example.nibbly

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nibbly.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra("SCORE", 0)
        val questions = QuestionRepository.questions
        val total = questions.size
        val percentage = (score.toFloat() / total.toFloat()) * 100    // Calculating percentage to determine which message to show

        "$score / $total".also { binding.scoreText.text = it }

        when { // Conditional logic (When expression) to provide user feedback (JetBrains, 2026)
            percentage >= 80 -> {
                "Hack Genius!".also { binding.resultMessage.text = it }
                "You're living in the year 3000. No myth can touch you!".also { binding.resultSubMessage.text = it }
            }
            percentage >= 50 -> {
                "Getting There!".also { binding.resultMessage.text = it }
                "You've got some good instincts, but keep those eyes peeled!".also { binding.resultSubMessage.text = it }
            }
            else -> {
                binding.resultMessage.text = getString(R.string.total_rookie)
                "Don't worry, even the pro hackers started somewhere. Let's learn!".also { binding.resultSubMessage.text = it }
            }
        }

        // Setup RecyclerView
        binding.reviewRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.reviewRecyclerView.adapter = ReviewAdapter(questions)

        // Toggle logic
        binding.reviewButton.setOnClickListener {
            binding.scoreContainer.visibility = View.GONE
            binding.reviewContainer.visibility = View.VISIBLE
        }

        binding.backToStats.setOnClickListener {
            binding.reviewContainer.visibility = View.GONE
            binding.scoreContainer.visibility = View.VISIBLE
        }

        // Restarting the app and clearing the activity stack (Google, 2026)

        binding.restartButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            finish()
        }
    }
}
