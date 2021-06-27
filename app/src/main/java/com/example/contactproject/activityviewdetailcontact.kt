package com.example.contactproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class activityviewdetailcontact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityviewdetailcontact)

        var  nameintent=intent.getStringExtra("name")
        var  emailintent=intent.getStringExtra("email")
        var  phoneintent=intent.getStringExtra("phoneNumber")

        var names=findViewById<TextView>(R.id.tvnames)
        var phones=findViewById<TextView>(R.id.tvphones)
        var emails=findViewById<TextView>(R.id.tvemails)

        names.text=nameintent
        phones.text=phoneintent
        emails.text=emailintent


        var previous = findViewById<Button>(R.id.btnprevious)
        previous.setOnClickListener {
            intent = Intent(baseContext,Contacts ::class.java)
            startActivity(intent)
        }
    }
}