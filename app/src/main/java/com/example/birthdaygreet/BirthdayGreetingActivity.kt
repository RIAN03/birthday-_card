package com.example.birthdaygreet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name = intent.getStringExtra(NAME_EXTRA)//NAME_EXTRA is the key of name input of mainactivity
        val greetUser=findViewById<TextView>(R.id.birthdayGreeting)//to get reference
       // birthdayGreeting= " Happy Birthday $name"
        greetUser.setText("Happy Birthday\n$name!")
    }
}
