## Nibbly — The Smart Hack App

A vibrant Fact vs Myth quiz application designed to debunk (or confirm) the internet's
craziest life hacks. Built with a focus on bold design and smooth interactions, Nibbly provides a playful learning experience across both web and mobile platforms.
<img width="310" height="265" alt="image" src="https://github.com/user-attachments/assets/7e93eff3-a601-4ea2-808c-651f81477805" />

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Key Features

- The Hack Challenge — A fast-paced quiz where you decide if a "hack" is a genius Fact or a total Myth.
- Instant Feedback — Get immediate explanations behind each hack once you answer.
- Score Review — A detailed breakdown of your results, letting you scroll through every question and learn the science behind the claims.
- Dynamic Progress — Visual progress tracking as you work through the Hack Levels.
- Nostalgic Palette — A custom UI theme inspired by "Banana Cream" and "Midnight Violet."

<img width="309" height="530" alt="image" src="https://github.com/user-attachments/assets/eca9e2fe-ca29-4fca-9e88-b44af18aaedc" />
<img width="304" height="262" alt="image" src="https://github.com/user-attachments/assets/541e8627-b7fb-446a-bdc5-a0dcaf894acf" />



--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Tech Stack

Mobile (Android)

| Layer | Technology | Reference |
| :--- | :--- | :--- |
| Language | Kotlin | JetBrains, 2024 |
| Architecture | XML Layouts with ViewBinding | Google, 2024a |
| UI Components | Google Material 3 — Cards, Chips, Progress Bars | Google, 2024b |
| Navigation | Intent-based activity transitions | — |
| List Handling | `RecyclerView` with custom `ReviewAdapter` | Google, 2024c |

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------


## Project Structure (Android Focus)



android/
├── build.gradle.kts              # Project-level build settings
├── settings.gradle.kts           # Project inclusion settings
└── app/
    ├── build.gradle.kts          # App-level dependencies
    └── src/main/
        ├── AndroidManifest.xml   # App permissions & activity registrations
        ├── java/com/example/nibbly/
        │   ├── MainActivity.kt
        │   ├── QuizActivity.kt
        │   ├── ScoreActivity.kt
        │   ├── HackQuestion.kt
        │   ├── QuestionRepository.kt
        │   └── ReviewAdapter.kt
        └── res/
            ├── layout/
            ├── values/
            └── drawable/


<img width="368" height="627" alt="image" src="https://github.com/user-attachments/assets/53262461-a0bc-45f7-ba2e-5b70c2b021c8" />



--------------------------------------------------------------------------------------------------------------------------------------------------------------------------


## Automated Quality Checks

A **GitHub Actions** workflow (GitHub, 2024) is located at `.github/workflows/Test.yml`.

Every time you push code, this workflow will:

1. Set up a virtual Android environment.
2. Attempt to compile your code.
3. Notify you of any syntax errors or build failures — keeping the app stable as you add more hacks.
   
<img width="269" height="74" alt="image" src="https://github.com/user-attachments/assets/02b877ea-3fd8-4ee4-9ca6-200d13cd4c6f" />

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------


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
