package com.faz.rootdetector

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.faz.rootchecker.RootDetector

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.rootDetectorTextView)?.apply textview@{
            RootDetector.isDeviceRooted().let isRooted@{
                when (it) {
                    true -> {
                        this@textview.text = getString(R.string.device_is_rooted)
                    }
                    false -> {
                        this@textview.text = getString(R.string.device_is_not_rooted)
                    }
                }
            }
        }
    }
}