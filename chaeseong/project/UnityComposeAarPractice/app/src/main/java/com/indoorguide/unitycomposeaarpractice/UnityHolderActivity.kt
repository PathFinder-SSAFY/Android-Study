package com.indoorguide.unitycomposeaarpractice

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.FrameLayout
import androidx.compose.ui.platform.ComposeView
import com.unity3d.player.UnityPlayer
import com.unity3d.player.UnityPlayerActivity

private const val TAG = "_ssafy"
class UnityHolderActivity: UnityPlayerActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val inflater = this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val ll = inflater.inflate(R.layout.activity_unity_holder, null) as FrameLayout
        val paramll = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT)
        this.addContentView(ll, paramll)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            UnityPlayer.UnitySendMessage("ScriptManager", "ReceiveMsg", "${++count}")
        }

    }
}