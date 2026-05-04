package com.example.nibbly

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.nibbly.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    // Binding object to access UI elements
    private lateinit var binding: ActivityQuizBinding

    // Variables to track the current question index, score, and user's choice
    private var currentIndex = 0
    private var score = 0
    private var selectedAnswer: Boolean? = null
    private val questions = QuestionRepository.questions // Pulls the list of questions from the central Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trueButton.text = getString(R.string.fact_)
        binding.falseButton.text = getString(R.string.myth)


        updateQuestion() // Display the initial question

        binding.trueButton.setOnClickListener { handleAnswer(true) }
        binding.falseButton.setOnClickListener { handleAnswer(false) }

        // onClickListener for user input using IF/ELSE statement
        binding.nextButton.setOnClickListener {
            if (currentIndex < questions.size - 1) {
                currentIndex++
                selectedAnswer = null
                updateQuestion()
            } else {

                //calculate final score with total
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("SCORE", score)
                intent.putExtra("TOTAL", questions.size)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun handleAnswer(answer: Boolean) {
        if (selectedAnswer != null) return
        selectedAnswer = answer

        val current = questions[currentIndex]
        val isCorrect = answer == current.answer

        binding.feedbackText.text = if (isCorrect) {
            score++
            "You Got It!\n\n${current.explanation}"
        } else {
            "Nice Try!\n\n${current.explanation}"
        }

        // Provide feedback based on the correctness of the answer
        binding.feedbackText.setTextColor(
            ContextCompat.getColor(this,
                if (isCorrect) R.color.dusty_grape else R.color.sandy_brown)
        )

        // Visual animation to show the feedback text
        binding.feedbackText.visibility = View.VISIBLE
        binding.feedbackText.alpha = 0f
        binding.feedbackText.animate().alpha(1f).setDuration(500).start()

        // Disable buttons after selection to lock the answer
        binding.nextButton.text = if (currentIndex == questions.size - 1) "Show My Results" else "Next Level"
        binding.nextButton.visibility = View.VISIBLE
        binding.trueButton.isEnabled = false
        binding.falseButton.isEnabled = false
    }

    private fun updateQuestion() {
        val current = questions[currentIndex]
        binding.questionText.text = current.statement
        binding.progressText.text = getString(R.string.hack_of, currentIndex + 1, questions.size) // Refresh UI with new question data
        binding.progressBar.progress = ((currentIndex + 1) * 100) / questions.size

        // Hide feedback and reset buttons for the new question
        binding.feedbackText.visibility = View.GONE
        binding.nextButton.visibility = View.GONE
        binding.trueButton.isEnabled = true
        binding.falseButton.isEnabled = true
    }
}
