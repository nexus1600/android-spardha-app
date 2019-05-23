package com.example.spardha

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.spardha.Sports.*

class SportsActivity : AppCompatActivity() {

    var atheletics:ImageButton?=null
    var cricket:ImageButton?=null
    var football:ImageButton?=null
    var vollybakll:ImageButton?=null
    var carrom: ImageButton?=null
    var tabletenish: ImageButton?=null
    var chess: ImageButton?=null
    var badminton: ImageButton?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports)

        atheletics=findViewById(R.id.athleat)
        cricket=findViewById(R.id.cricket)
        football=findViewById(R.id.sport_football)
        vollybakll=findViewById(R.id.vollyball)

        carrom=findViewById(R.id.carrom)
        tabletenish=findViewById(R.id.tabletenish)
        chess=findViewById(R.id.chess)
        badminton=findViewById(R.id.badminton)


        atheletics?.setOnClickListener({
            var clickIntent = Intent(this@SportsActivity,AtheleticsActivity::class.java)
            startActivity(clickIntent)
        })
        cricket?.setOnClickListener({
            var clickIntent = Intent(this@SportsActivity,CricketActivity::class.java)
            startActivity(clickIntent)
        })
            football?.setOnClickListener({
            var clickIntent = Intent(this@SportsActivity,FootballActivity::class.java)
            startActivity(clickIntent)
        })
        vollybakll?.setOnClickListener({
            var clickIntent = Intent(this@SportsActivity,VollyballActivity::class.java)
            startActivity(clickIntent)
        })

        carrom?.setOnClickListener({
            var clickIntent = Intent(this@SportsActivity, CarromActivity::class.java)
            startActivity(clickIntent)
        })
        tabletenish?.setOnClickListener({
            var clickIntent = Intent(this@SportsActivity, TabletennishActivity::class.java)
            startActivity(clickIntent)
        })
        chess?.setOnClickListener({
            var clickIntent = Intent(this@SportsActivity, ChessActivity::class.java)
            startActivity(clickIntent)
        })
        badminton?.setOnClickListener({
            var clickIntent = Intent(this@SportsActivity, BadmintonActivity::class.java)
            startActivity(clickIntent)
        })
    }
}
