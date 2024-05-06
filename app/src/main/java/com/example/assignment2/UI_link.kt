package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class UI_link : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_link)
        // 3 increase variables are declared and allocated within the appropriate button so that the text associated with the button being pressed increments
        var cleanRating = 0
        var hungerRating = 0
        var playRating = 0


        // display image that will be displayed on the screen when the different buttons are pressed is declared
        var displayImage = findViewById<ImageView>(R.id.defaultDog)

        // the 3 buttons that the user will be interacting with is declared and imported, so that code can be added to the buttons on this page
        val play = findViewById<Button>(R.id.playButton)
        val feed = findViewById<Button>(R.id.feedButton)
        val clean = findViewById<Button>(R.id.cleaButton)

        // the 3 text views that will display the rating of the dog is declared and imported here
        var hunger = findViewById<TextView>(R.id.hungerRating)
        var cleanliness = findViewById<TextView>(R.id.cleanLabel)
        var playfulness = findViewById<TextView>(R.id.playLabel)

        // the feed button is initialized so that when clicked, the lines of code below runs
        feed.setOnClickListener {

            // the image displayed on the screen changes to the appropriate image relating to the button label, being a dog eating its food
            displayImage.setImageResource(R.drawable.eatingnobg)

            // the text in the text view is converted to an integer so that it can be manipulated in the if function below
            val hungerValue = hunger.text.toString().toInt()

            // the if statement limits the user to increment the rating of the dogs hunger up until 10
            if (hungerValue < 10) {
                hungerRating++
            }

            // the text view which will be displayed to the user is made equal to the increment variable, which holds the rating based on how much time the button has been pressed, with a limit up until 10
            hunger.text = hungerRating.toString()

            // to simulate a living virtual pet if statements were used to decrement the play and clean ratings so that the user is encouraged to monitor the ratings of the pet and try to balance them accordingly
            // once the hunger value reaches 10 and is continuously pressed, the play and clean rating will decrease
            if (hungerValue > 9) {
                playRating--
                playfulness.text = playRating.toString()

                cleanRating--
                cleanliness.text = cleanRating.toString()
            }

        }

        // the play button is being declared and code dealing with the functionality of the button is included below
        play.setOnClickListener {

            // the image of the pet changes to a muddy doo laying on its back to signify the dog now being played with by the user, when the play button is pressed
            displayImage.setImageResource(R.drawable.muddy_dog)

            // the play value is changed into the integer data type so that it can be manipulated as a number in an nif statement
            val playValue = playfulness.text.toString().toInt()

            // an if statement is used to limit the roof of the play rating to 10
            if (playValue < 10) {
                playRating++
            }
            playfulness.text = playRating.toString()

            // once the play button is pressed, the hunger adn clean rating immediately decreases to prompt the user to take care of the virtual pet
            hungerRating--
            cleanRating--

            hunger.text = hungerRating.toString()
            cleanliness.text = cleanRating.toString()

        }
        clean.setOnClickListener {

            // the pet image changes to a pet covered with detergent to notify the user that the pet is now being cleaned, once the hclean button is pressed
            displayImage.setImageResource(R.drawable.clean_dog)

            // the clean value is changed into an integer to be manipulated in the if statement below
            val cleanValue = cleanliness.text.toString().toInt()

            // an if statement is used to limit the roof of the clean rating to 10
            if (cleanValue < 10) {
                cleanRating++
            }
            cleanliness.text = cleanRating.toString()

            // once the clean value is greater than 4, the play rating will decrease prompting the user to monitor and balance the different ratings of the virtual pet
            if (cleanValue > 4) {
                playRating--
                playfulness.text = playRating.toString()
            }

            // once the clean value isi greater than 7, the hunger rating will start to decrease by 1 prompting the user to balance the ratings of the virtual pet
            if (cleanValue > 7) {
                hungerRating--
                hunger.text = hungerRating.toString()
            }
        }
    }
}