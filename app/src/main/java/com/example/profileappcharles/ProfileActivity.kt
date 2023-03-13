package com.example.profileappcharles

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val button1 : ImageView = findViewById(R.id.instagram_image)
        button1.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/lharlesl/"))
            startActivity(i)
        }

        val button2 : ImageView = findViewById(R.id.linkedin_image)
        button2.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/charles-gunawan-393b69234/"))
            startActivity(i)
        }

        val button3 : ImageView = findViewById(R.id.wa_image)
        button3.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/+6282371511912"))
            startActivity(i)
        }
    }
}