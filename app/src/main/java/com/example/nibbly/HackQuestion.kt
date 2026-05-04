package com.example.nibbly

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
* Using @Parcelize ensures that the object can be serialized and
* passed between Activities efficiently (Google, 2026).
*/
@Parcelize
data class HackQuestion(
    val statement: String, // The textual content of the question
    val answer: Boolean, // The boolean logic used to determine the correct response
    val explanation: String // Detailed feedback provided to the user after an answer is selected
) : Parcelable
