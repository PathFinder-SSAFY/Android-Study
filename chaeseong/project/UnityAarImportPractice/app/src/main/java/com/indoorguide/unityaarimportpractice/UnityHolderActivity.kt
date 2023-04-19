package com.indoorguide.unityaarimportpractice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.unity3d.player.UnityPlayerActivity

class UnityHolderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, UnityPlayerActivity::class.java)
        startActivity(intent)
    }
}