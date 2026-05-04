package com.example.nibbly

/**
 * According to Gemini (2026), the repository is defined as
 a singleton object that acts as the data source for the app. Therefore,
Using 'object' ensures only one instance of the repository exists in memory.

Reference:
Gemini, 2026. Response to query regarding ‘QuestionRepository’ architecture. [Generative AI]
Prompted by: Kabelo Litheko. 4 May 2026.

 * Using 'object' ensures only one instance of the repository exists in memory.
 */

object QuestionRepository {

    //An immutable list of HackQuestion objects with hardcoded strings are used here:

    val questions = listOf(
        HackQuestion("Using the sticky edge of a Post-it note can help clean dust from between your computer keys.", true, "The adhesive picks up lint without residue."),
        HackQuestion("Putting a dry towel in the dryer with your wet clothes will significantly speed up the drying time.", true, "The towel absorbs initial moisture."),
        HackQuestion("Shaving your hair causes it to grow back thicker and darker than before.", false, "It only feels thicker because the ends are blunt."),
        HackQuestion("Pushing a straw from the bottom of a strawberry through the top is the easiest way to remove the stem.", true, "The 'straw method' hulls it with minimal waste."),
        HackQuestion("Sprinkling a little bit of sugar on a burnt tongue can help soothe the pain.", true, "Sugar dampens pain sensors on the tongue."),
        HackQuestion("Tying a bright ribbon to your suitcase ensures it will be unloaded first from the airplane.", false, "It helps you spot it, but order is random."),
        HackQuestion("A binder clip can be used on the edge of a desk to act as a cable organizer.", true, "The loops keep cables from falling behind."),
        HackQuestion("Taking a 'coffee nap' involves drinking coffee immediately after a 20-minute nap.", false, "Drink it BEFORE for the caffeine to kick in as you wake.")
    )
}
