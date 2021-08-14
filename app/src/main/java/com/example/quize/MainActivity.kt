package com.example.quize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        math_game.setOnClickListener {
            startActivity(Intent(this,MathActivity :: class.java))
        }

        x_and_o.setOnClickListener {
            startActivity(Intent(this,TicTacToeActivity :: class.java))
        }

        test_game.setOnClickListener {
            startActivity(Intent(this,TestActivity::class.java))
        }

        flag_game.setOnClickListener {
            startActivity(Intent(this,FlagActivity::class.java))
        }
    }

}