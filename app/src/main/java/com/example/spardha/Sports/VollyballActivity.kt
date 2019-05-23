package com.example.spardha.Sports

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.spardha.R
import com.example.spardha.RegisterForActivity

class VollyballActivity : AppCompatActivity() {
    var registerEvent:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vollyball)
                registerEvent=findViewById(R.id.register_for)

                registerEvent?.setOnClickListener ({
            var clickIntent = Intent(this@VollyballActivity, RegisterForActivity::class.java)
            startActivity(clickIntent)
            Toast.makeText(this@VollyballActivity,"register succesfully", Toast.LENGTH_LONG).show()
        })
    }
}
