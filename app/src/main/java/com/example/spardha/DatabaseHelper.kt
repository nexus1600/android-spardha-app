package com.example.spardha

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) :SQLiteOpenHelper(context, DB_NAME,factory, version){

    companion object {
        internal val DB_NAME: String ="register.db"
        internal val TABLE_NAME ="registeruser"
        internal val factory = null
        internal val version= 1
        internal val COL1 ="ID"
        internal val COL2 ="username"
        internal val COL3 ="password"

    }




    override fun onCreate(SQLiteDatabase: SQLiteDatabase?) {
        SQLiteDatabase?.execSQL(" CREATE TABLE registeruser (ID INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT)")
    }

    override fun onUpgrade(SQLiteDatabase: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        SQLiteDatabase?.execSQL(" DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(SQLiteDatabase)
    }
    fun addUser(user : String,password : String):Long{
        val db : SQLiteDatabase = this.writableDatabase
        val contentValues  = ContentValues()
        contentValues.put("username",user)
        contentValues.put("password",password)
        val res = db.insert("registeruser",null,contentValues)
        db.close()
        return res
    }
    fun checkUser(username: String, password: String):Boolean {
        val db = writableDatabase
        val query = " select * from registeruser where username = $COL2 and password = $COL3 "
        val cursor = db.rawQuery(query,null)
        if (cursor.count >= 0) {
            cursor.close()
            return true
        }
        cursor.close()
        return false

    }


}