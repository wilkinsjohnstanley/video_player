package com.example.video_player
import android.net.Uri
import android.net.Uri.*
import android.widget.MediaController
import android.widget.VideoView

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.video_player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.toolbar)
//
//        val navController = findNavController(R.id.nav_host_fragment_content_main)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)
//
//        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null)
//                .setAnchorView(R.id.fab).show()
//            setContentView(R.layout.activity_main)

//Find the VideoView class by its id

            val videoView = findViewById<VideoView>(binding.testView.id)

//Creating MediaController

            val mediaController = MediaController(this)

            mediaController.setAnchorView(videoView)

//specify the location of media file

            val uri:Uri = parse(

                "android.resource://" + packageName

                        + "/raw/liminal"

            )

//Setting MediaController and URI, then starting the videoView

            videoView.setMediaController(mediaController)

            videoView.setVideoURI(uri)

            videoView.requestFocus()

            videoView.start()

        }
    }

