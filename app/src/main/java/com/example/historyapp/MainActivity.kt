package com.example.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val TextDecimal = findViewById<EditText>(R.id.TextDecimal)
        val ClickMeButton = findViewById<Button>(R.id.ClickMeButton)
        val ClickMeButton2 = findViewById<Button>(R.id.ClickMeButton2)
        val textView2 = findViewById<TextView>(R.id.textView2)



        ClickMeButton.setOnClickListener {
            val enternum = TextDecimal.text.toString().toIntOrNull()


            if (enternum == 20) {
                textView2.text = "Cameron Boyce the actor died at the young age of 20"
            }

            if (enternum == 21) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 22) {
                textView2.text = "Aziz Shavershian the youtube star died at this age"
            }

            if (enternum == 23) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 24) {
                textView2.text = "Nobody died at this age"
            }
            if (enternum == 25) {
                textView2.text = "Tupac Shakur, one of the most famous rappers died at this age"
            }

            if (enternum == 26) {
                textView2.text =
                    "Mac Miller was one of the most influential rappers to die at such a young age"
            }

            if (enternum == 27) {
                textView2.text = "nobody died at this age"
            }

            if (enternum == 28) {
                textView2.text = "nobody died at this age"
            }

            if (enternum == 29) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 30) {
                textView2.text = "The young Michelle Thomas was taken at the age of 30"
            }

            if (enternum == 31) {
                textView2.text = "Cat Janice the tik tok star lost her battle to cancer"
            }

            if (enternum == 32) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 33) {
                textView2.text = "The TV actress Naya Rivera died at this age"
            }

            if (enternum == 34) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 35) {
                textView2.text = "The south African rapper AKA was killed"
            }

            if (enternum == 36) {
                textView2.text = "The famous reggae singer Bob Marley died at this age"
            }

            if (enternum == 37) {
                textView2.text =
                    "The world famous historical figure Vincent van Gogh died at this age"
            }

            if (enternum == 38) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 39) {
                textView2.text = "The civil rights leader Martin Luther King Jr. was assasinated"
            }

            if (enternum == 40) {
                textView2.text =
                    "The Fast and Furious actor Paul Walker was killed in an accident at the early age of 40"
            }

            if (enternum == 41) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 42) {
                textView2.text = "The rock singer Elvis Presely died at this age"
            }

            if (enternum == 43) {
                textView2.text =
                    "One of Marvels biggest stars and the Lead actor in Black Panther, Chadwick Boseman lost his battle to cancer"
            }

            if (enternum == 44) {
                textView2.text = "The animal lover Steve Irwin died at this age"
            }

            if (enternum == 45) {
                textView2.text = "The world famous rock singer Freddie Mercury died at this age"
            }

            if (enternum == 46) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 47) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 48) {
                textView2.text = "The R and B singer Whitney Houston"
            }

            if (enternum == 49) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 50) {
                textView2.text =
                    "Possibly the most famous music star Michael Jackson died at this age"
            }

            if (enternum == 51) {
                textView2.text = "The TV and movie actor James Gandolfolfini died at this age"
            }

            if (enternum == 52) {
                textView2.text = "The famous writer and poet William Shakespeare died at this age"
            }

            if (enternum == 53) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 54) {
                textView2.text =
                    "Just recently the movie actor Mathew Perry died an  unexpected death"
            }

            if (enternum == 55) {
                textView2.text = "TV actor Roger Delgado died at this age"
            }

            if (enternum == 56) {
                textView2.text = "Abraham Lincon died at this age"
            }

            if (enternum == 57) {
                textView2.text =
                    "One of the most famous movie actors Patrick Swayze died at this age"
            }

            if (enternum == 58) {
                textView2.text = "Kanye Wests mother Donda West died at this age"
            }

            if (enternum == 59) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 60) {
                textView2.text = "Diego Maradona the soccer player died at this age"
            }

            if (enternum == 61) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 62) {
                textView2.text = "Toby Keith the country died at this age"
            }

            if (enternum == 63) {
                textView2.text = "Robin Williams the movie actor died at this age"
            }

            if (enternum == 64) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 65) {
                textView2.text = "Walt Disney the entrepeneur of Disney died at this age"
            }

            if (enternum == 66) {
                textView2.text = "Tom Petty the rock singer died at this age"
            }

            if (enternum == 67) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 68) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 69) {
                textView2.text = "David Bowie the rock singer died at this age"
            }

            if (enternum == 70) {
                textView2.text = "Buster Keaton the Comedian died at this age"
            }

            if (enternum == 71) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 72) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 73) {
                textView2.text = "Olivia Newton-John the pop singer died at this age"
            }

            if (enternum == 74) {
                textView2.text =
                    "One of the worlds most famous boxers and possibly the greatest of all time passed away at this age"
            }

            if (enternum == 75) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 76) {
                textView2.text = "The physicist Albert Einstein passed away at this age"
            }

            if (enternum == 77) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 78) {
                textView2.text =
                    "The famous civil rights leader Mahatma Gandhi passed away at this age"
            }

            if (enternum == 79) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 80) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 81) {
                textView2.text = "Queen Victoria died at this age"
            }

            if (enternum == 82) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 83) {
                textView2.text = "The famous Tina Turner passed away at this age"
            }

            if (enternum == 84) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 85) {
                textView2.text = "James Madison one of US presidents passed at this age"
            }

            if (enternum == 86) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 87) {
                textView2.text = "Jim Brown the famous football player passed away at this age"
            }

            if (enternum == 88) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 89) {
                textView2.text = "The TV actress Nichelle Nichols passed away at this age"
            }

            if (enternum == 90) {
                textView2.text = "The world leader Winston Churchill passed away at this age"
            }

            if (enternum == 91) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 92) {
                textView2.text = "The first lady Barbara Bush died at this age"
            }

            if (enternum == 93) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 94) {
                textView2.text = "The stage actress Elizabeth Wilson died at the late age of 94"
            }

            if (enternum == 95) {
                textView2.text = "Stan Lee the starter of marvel comics left us at this age"
            }

            if (enternum == 96) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 97) {
                textView2.text = "Dorris Day the movie actress died at this age"
            }

            if (enternum == 98) {
                textView2.text = "Nobody died at this age"
            }

            if (enternum == 99) {
                textView2.text = "The beloved Billy Graham passed at this age"
            }

            if (enternum == 100) {
                textView2.text = "The movie actress Glynis Johns died at the great age of 100"
            } else {
                textView2.text = "Please enter a number in between the age of 20 - 100."
            }
        }

        // for my ages I used google to find out which people died at which ages.
        // I used the if else statement for my coding
        //The long List if IF statements were for the ages 20-100
        //The Else statement at the end was to make sure people stay between the ages of 20-100, if they fall out they will be told to stay within the range.

        //Referencing for my code
        // The Independent Institution of education. (2004)Introduction To Mobile Application and Development. Varsity College Pietermaritzburg
        //        [Online website] Available at Student Materials on website. Default View (sharepoint.com). [Accessed: 29 April 2024]

        var editField = findViewById<EditText>(R.id.textView2)
        ClickMeButton2.setOnClickListener { TextDecimal.text.clear() } }}

        //these last two lines were for my clear button.
        //ClickMeButton2 was the clear button for my app.


//I used the module Manual and class activities for my coding
//The second reference is for the website where i got the dates of the celebrities that have passed away.

//Referencing will be below:

        /*
        The Independent Institution of education. (2004)Introduction To Mobile Application and Development. Varsity College Pietermaritzburg
        [Online website] Available at Student Materials on website. Default View (sharepoint.com). [Accessed: 29 April 2024]

        FamousBirthdays. [no date] Deaths By Year. [Online]. Available at: http://www.famousbirthdays.com [accessed 28 March 2024]

         */














