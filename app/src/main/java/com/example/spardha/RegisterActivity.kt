package com.example.spardha

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    var textUsername : EditText?=null
    var textPassword : EditText?=null
    var textConfirmPassword : EditText?=null
    var loginButton : Button?=null
    var textViewLogin : TextView?=null
    lateinit var handler:DatabaseHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        handler = DatabaseHelper(this)
        textUsername= findViewById(R.id.text_username)
        textPassword= findViewById(R.id.text_password)
        textConfirmPassword=findViewById(R.id.text_confirmpassword)
        loginButton= findViewById(R.id.register_button)
        textViewLogin= findViewById(R.id.textview_login)
        textViewLogin?.setOnClickListener({
            var clickIntent = Intent(this@RegisterActivity,MainActivity::class.java)
            startActivity(clickIntent)
        })
        loginButton?.setOnClickListener({
            var user:String =textUsername?.getText().toString().trim()
            var pwd:String =textPassword?.getText().toString().trim()
            var cnf_pwd:String =textConfirmPassword?.getText().toString().trim()
        if (pwd.equals(cnf_pwd)){
            var value: Long =handler.addUser(user,pwd)
            if (value>0){
                Toast.makeText(this@RegisterActivity,"You have registered", Toast.LENGTH_LONG).show()
                var moveToLogin = Intent(this@RegisterActivity,MainActivity::class.java)
                startActivity(moveToLogin)
            }else{
                Toast.makeText(this@RegisterActivity,"Login Error ", Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(this@RegisterActivity,"password is not matched",Toast.LENGTH_LONG).show()
        }
        })
    }
}
