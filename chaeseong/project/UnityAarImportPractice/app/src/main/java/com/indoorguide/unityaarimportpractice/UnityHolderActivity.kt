package com.indoorguide.unityaarimportpractice

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.unity3d.player.UnityPlayer
import com.unity3d.player.UnityPlayerActivity

private const val TAG = "ssafy"
class UnityHolderActivity : UnityPlayerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val intent = Intent(this, UnityPlayerActivity::class.java)
//        startActivity(intent)
        UnityPlayer.UnitySendMessage("ScriptManager", "ReceiveMsg", "Received Msg!!")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

}