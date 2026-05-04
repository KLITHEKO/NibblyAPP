Nibbly — The Smart Hack App

A vibrant Fact vs Myth quiz application designed to debunk (or confirm) the internet's
craziest life hacks. Built with a focus on bold design and smooth interactions, Nibbly provides a playful learning experience across both web and mobile platforms.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Key Features

- The Hack Challenge — A fast-paced quiz where you decide if a "hack" is a genius Fact or a total Myth.
- Instant Feedback — Get immediate explanations behind each hack once you answer.
- Score Review — A detailed breakdown of your results, letting you scroll through every question and learn the science behind the claims.
- Dynamic Progress — Visual progress tracking as you work through the Hack Levels.
- Nostalgic Palette — A custom UI theme inspired by "Banana Cream" and "Midnight Violet."

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Tech Stack

Mobile (Android)

| Layer | Technology | Reference |

| Language | Kotlin | JetBrains, 2024 |
| Architecture | XML Layouts with ViewBinding | Google, 2024a |
| UI Components | Google Material 3 — Cards, Chips, Progress Bars | Google, 2024b |
| Navigation | Intent-based activity transitions | — |
| List Handling | `RecyclerView` with custom `ReviewAdapter` | Google, 2024c |

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------


## Project Structure (Android Focus)


android/
├── build.gradle.kts          # Project-level build settings
├── settings.gradle.kts       # Project inclusion settings
└── app/                      # The main application module
    ├── build.gradle.kts      # App-level dependencies (ViewBinding, Kotlin, etc.)
    └── src/main/
        ├── AndroidManifest.xml   # App permissions and screen registrations
        ├── java/com/example/nibbly/
        │   ├── MainActivity.kt      # Home screen with the "Start" button
        │   ├── QuizActivity.kt      # Core gameplay (Question logic & timers)
        │   ├── ScoreActivity.kt     # Results screen & scrollable review list
        │   ├── HackQuestion.kt      # Data Model (Definition of a "Hack")
        │   ├── QuestionRepository.kt# The "Brain" (List of all facts & myths)
        │   └── ReviewAdapter.kt     # Logic for showing the result cards
        └── res/
            ├── layout/              # UI Design Files (XML)
            │   ├── activity_main.xml   # Home screen design
            │   ├── activity_quiz.xml   # Quiz screen (Fact/Myth buttons)
            │   ├── activity_score.xml  # Scoreboard design
            │   └── item_review.xml     # Template for a single review card
            ├── values/              # Design Tokens
            │   ├── colors.xml          # Banana Cream, Midnight Violet, etc.
            │   ├── strings.xml         # App name and hardcoded text
            │   └── themes.xml          # Global look and feel (Material 3)
            └── drawable/            # App icons and background shapes




--------------------------------------------------------------------------------------------------------------------------------------------------------------------------


## Automated Quality Checks

A **GitHub Actions** workflow (GitHub, 2024) is located at `.github/workflows/Test.yml`.

Every time you push code, this workflow will:

1. Set up a virtual Android environment.
2. Attempt to compile your code.
3. Notify you of any syntax errors or build failures — keeping the app stable as you add more hacks.

---

## Colour System

| Name | Hex | Usage |
| :--- | :--- | :--- |
| **Banana Cream** | `#fce762` | Borders, Accents, Highlights |
| **Midnight Violet** | `#201335` | Text, Dark Backgrounds |
| **Sandy Brown** | `#ffb17a` | Progress Indicators, Errors |
| **Ivory** | `#fffded` | App Background |

---

## References

GitHub (2024) *GitHub Actions documentation* [online]. Available at: https://docs.github.com/en/actions [Accessed 4 May 2026].

Google (2024a) *View binding* [online]. Android Developers. Available at: https://developer.android.com/topic/libraries/view-binding [Accessed 4 May 2026].

Google (2024b) *Material Design 3* [online]. Available at: https://m3.material.io [Accessed 4 May 2026].

Google (2024c) *RecyclerView* [online]. Android Developers. Available at: https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView [Accessed 4 May 2026].

Google (2024d) *Android Studio* [online]. Available at: https://developer.android.com/studio [Accessed 4 May 2026].

JetBrains (2024) *Kotlin documentation* [online]. Available at: https://kotlinlang.org/docs/home.html [Accessed 4 May 2026].
