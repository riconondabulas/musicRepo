package com.example.musicapp


import android.util.Log

class Song (songName: String, songArtist: String, songYear: Int, songDuration: String) {


    //adding variables for the object's attributes
    var name : String =" "
    var artist : String = ""
    var year : Int = 0
    var duration : String = ""

    //initialising the variables for the song objects
    init{
        name = songName
        artist = songArtist
        year= songYear
        duration= songDuration
    }

    //function to play a song
    fun Play() {
        Log.v("Song","$name is playing now")
    }

    //function to pause
    fun Pause(){
        Log.v("Song","$name is paused now")

    }

    //function to stop a song
    fun Stop(){
        Log.v("Song","$name is stopped now")

    }


    //function to favourite a song
    fun Favourite(): Boolean{
        Log.v("Song","$name is favourited now")
        return true

    }






}