package com.example.quize

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_tic_tac_toe.*
import kotlin.random.Random

class TicTacToeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe)

        resetGame.setOnClickListener {
            startActivity(Intent(this, TicTacToeActivity::class.java))
            finish()
        }
    }

    fun buClick(view: View) {
        val buSelected: Button = view as Button
        var cellId = 0

        when (buSelected.id) {
            R.id.B1 -> cellId = 1
            R.id.B2 -> cellId = 2
            R.id.B3 -> cellId = 3
            R.id.B4 -> cellId = 4
            R.id.B5 -> cellId = 5
            R.id.B6 -> cellId = 6
            R.id.B7 -> cellId = 7
            R.id.B8 -> cellId = 8
            R.id.B9 -> cellId = 9
        }
        game(cellId, buSelected)
    }

    private var activeplayer = 1
    private var player1 = arrayListOf<Int>()
    private var player2 = arrayListOf<Int>()
    private val a = 5

    @SuppressLint("SetTextI18n")
    private fun game(cellId: Int, buSelected: Button) {
        if (activeplayer == 1) {
            winner.text = "Player 2 Turn"
            buSelected.text = "X"
            player1.add(cellId)
            activeplayer = 2
            buSelected.setBackgroundColor(Color.GREEN)
            if (player1.size < a) {
                AvtoPlay()
            }
        } else {
            winner.text = "Player 1 Turn"
            buSelected.text = "O"
            player2.add(cellId)
            activeplayer = 1
            buSelected.setBackgroundColor(Color.CYAN)

        }
        buSelected.isEnabled = false
        win()

    }


    @SuppressLint("SetTextI18n")
    private fun win() {
        var winer = 0

        if (B1.text == "X" && B2.text == "X" && B3.text == "X") {
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
            winer = 1
        }
        if (B4.text == "X" && B5.text == "X" && B6.text == "X") {
            winer = 1
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }
        if (B7.text == "X" && B8.text == "X" && B9.text == "X") {
            winer = 1
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }

        if (B1.text == "X" && B4.text == "X" && B7.text == "X") {
            winer = 1
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }
        if (B2.text == "X" && B5.text == "X" && B8.text == "X") {
            winer = 1
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }
        if (B3.text == "X" && B6.text == "X" && B9.text == "X") {
            winer = 1
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }

        if (B1.text == "X" && B5.text == "X" && B9.text == "X") {
            winer = 1
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }
        if (B3.text == "X" && B5.text == "X" && B7.text == "X") {
            winer = 1
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }

        if (B1.text == "O" && B2.text == "O" && B3.text == "O") {
            winer = 2
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }
        if (B4.text == "O" && B5.text == "O" && B6.text == "O") {
            winer = 2
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }
        if (B7.text == "O" && B8.text == "O" && B9.text == "O") {
            winer = 2
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }

        if (B1.text == "O" && B4.text == "O" && B7.text == "O") {
            winer = 2
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }
        if (B2.text == "O" && B5.text == "O" && B8.text == "O") {
            winer = 2
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }
        if (B3.text == "O" && B6.text == "O" && B9.text == "O") {
            winer = 2
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }

        if (B1.text == "O" && B5.text == "O" && B9.text == "O") {
            winer = 2
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }
        if (B3.text == "O" && B5.text == "O" && B7.text == "O") {
            winer = 2
            B1.isEnabled = false
            B2.isEnabled = false
            B3.isEnabled = false
            B4.isEnabled = false
            B5.isEnabled = false
            B6.isEnabled = false
            B7.isEnabled = false
            B8.isEnabled = false
            B9.isEnabled = false
        }

        if (winer == 0 && player1.size + player2.size == 9) {
            winner.text = "Draw"
        }
        if (winer == 1) {
            winner.text = "Player 1 Wins"

        }
        if (winer == 2) {
            winner.text = "Player 2 Wins"

        }
    }

    fun AvtoPlay() {
        val emptyCells = ArrayList<Int>()
        for (cellId in 1..9) {
            if (!(player1.contains(cellId) || player2.contains(cellId))) {
                emptyCells.add(cellId)
            }
        }
        val r = Random
        val randIndex = r.nextInt(emptyCells.size)
        val cellId = emptyCells[randIndex]

        val buSelected: Button? = when (cellId) {
            1 -> B1
            2 -> B2
            3 -> B3
            4 -> B4
            5 -> B5
            6 -> B6
            7 -> B7
            8 -> B8
            9 -> B9
            else -> {
                B1
            }
        }
        if (buSelected != null) {
            game(cellId, buSelected)
        }
    }
}

