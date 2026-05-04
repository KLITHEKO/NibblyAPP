// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    // Required for the @Parcelize annotation in HackQuestion.kt
    id("org.jetbrains.kotlin.plugin.parcelize") version "1.9.0" apply false
}