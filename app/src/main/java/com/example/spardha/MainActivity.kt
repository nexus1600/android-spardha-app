package com.example.spardha

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var textUsername : EditText?=null
    var textPassword : EditText?=null
    var loginButton : Button?=null
    var textViewRegister : TextView?=null
    lateinit var handler:DatabaseHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = DatabaseHelper(this)
        textUsername= findViewById(R.id.text_username)
        textPassword= findViewById(R.id.text_password)
        loginButton= findViewById(R.id.login_button)
        textViewRegister= findViewById(R.id.textview_registration)

        textViewRegister?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,RegisterActivity::class.java)
            startActivity(clickIntent)
        })
        loginButton?.setOnClickListener({
            var user:String =textUsername?.getText().toString().trim()
            var pwd:String =textPassword?.getText().toString().trim()
            var res:Boolean=handler.checkUser(username = user, password = pwd)
            if (res == true){
                var clickIntent = Intent(this@MainActivity,SportsActivity::class.java)
                startActivity(clickIntent)
            }else{
                Toast.makeText(this@MainActivity,"Login Error",Toast.LENGTH_LONG).show()
            }

        })
    }
}
