package com.ddrift.memosample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    /* ====== 發生非正常銷毀 ===== */
    /* like system kill the app process */

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    /**
     * 在非正常銷毀畫面的情況下，為了保留原有畫面的資料，
     * 將會進入該狀態，複寫可以存下客製化的資料。
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    /**
     * 當畫面要復原時，可以在這個狀態讀回客製化的資料。
     */
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
}
