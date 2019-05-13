package com.android.sample.animation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.opengl.ETC1.getHeight
import android.view.View
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEventListener


class MainActivity : AppCompatActivity() {

    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        KeyboardVisibilityEvent.setEventListener(this) { isOpen ->
            if (isOpen) {
                hideBtnView()
            } else {
                showBtnView()
            }
        }
    }

    private fun hideBtnView() {
        btnView.animate().translationY(-btnView.height.toFloat())
        dataView.animate().translationY(-btnView.height.toFloat())
    }

    private fun showBtnView() {
        btnView.animate().translationY(0f)
        dataView.animate().translationY(0f)
    }
}
