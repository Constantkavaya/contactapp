package com.example.contactproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contactNames()
    }
    fun  contactNames(){
        var  rivcontact=findViewById<RecyclerView>(R.id.rivcontactlist)

        var  listContacts= listOf(
            Contacts("Lulu Hassan","0786543245","loulohassan@gmail.com"),
            Contacts("Yasmeen Said","0784563245","saidyasmeen@gmail.com"),
            Contacts("Ruth Mideva","0714057605","ruthmideva@gmail.com")

        )
        var coursesAdapter=ContactNumbers(listContacts)
        rivcontact.layoutManager= LinearLayoutManager(baseContext)
        rivcontact.adapter=coursesAdapter
    }
}