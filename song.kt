package com.example.sponnuchamy.Song

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val song: String = "Smack That ft. Eminem"
        Log.d("Song:", song)

        val artist: String = "Akon"
        Log.d("Artist:", artist)

        val featuredArtist: String = "Eminem"
        Log.d("FeaturedArtist:", featuredArtist)

        val released: String = "September 25, 2006"
        Log.d("Released:", released  )


        val recorded: Int = 2006
        Log.d("Recorded:", recorded.toString())

        val genres: String = "Contemporary R&B, Reggae, R&B/Soul, Hip-Hop/Rap"
        Log.d("Genres:", genres)


        val isArtistString: Boolean = artist is String
        Log.d("ArtistCheck:", isArtistString.toString())

        val isRecordedString: Boolean = recorded is Int
        Log.d("RecorededCheck:", isRecordedString.toString())

        val length: Float = 3.32f
        Log.d("Length:", length.toString())

        val sold: Double = 4767373326.32
        Log.d("Sold:", sold.toString())

    }
}
