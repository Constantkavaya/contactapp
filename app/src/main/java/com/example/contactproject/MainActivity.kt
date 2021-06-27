package com.example.contactproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contactNames()
    }
    fun  contactNames(){
        var  rivcontactlist=findViewById<RecyclerView>(R.id.rivcontactlist)

        var  contactLists= listOf(
            Contacts("Pauline Brown","0786546789","paulinebrown@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTFXDsh17gr72XxE0zsRJ0E1nRGmK4F3pzugIHBr8yrvij0uiNcT7q7NtQiu_BeQQABF3s&usqp=CAU"),
            Contacts("Lulu Hassan","0786543245","loulohassan@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSE2Sy0_8vfkpqmfe-o7RTTwzJI3f3tgwPM0ZIyrn9wcisHOfZu7fj9dZDVR7-7h1CjDuk&usqp=CAU"),
            Contacts("Yasmeen Said","0784563245","saidyasmeen@gmail.com","https://i.pinimg.com/236x/c1/ae/26/c1ae264d12f24992dbc69226a0e03cf5--fall-collections-spring-collection.jpg"),
            Contacts("Ruth Mideva","0714057605","ruthmideva@gmail.com","https://ocdn.eu/pulscms-transforms/1/Qldk9kpTURBXy83ZTRmNjEyN2Y0ZmQzYjk4MGJlZWQ3MWJiYWFiMjBmMi5qcGeRlQLNAUAAw8OCoTAFoTEB") ,
            Contacts("Hassan lulu","0787889009","loulouhassan@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmVaScpkJ0LUoRflZO3l6O-y6_o0Ajg8U2fA&usqp=CAU"),
            Contacts("Saline Kay","0784909900","salinekayline@gmail.com","https://www.mamboleo.co.ke/wp-content/uploads/2021/02/Photo-by-Bridget-Shighadi-on-February-2-240x300.jpg"),
            Contacts("Sharon Juliet","0714457890","sharonjuliet@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPPaSXXp2Fi_IwOr2c5ZL6Y8G6mwRtpmP-Mw&usqp=CAU"),
        )
        var coursesAdapter=ContactNumbers(contactLists,baseContext)
        rivcontactlist.layoutManager= LinearLayoutManager(baseContext)
        rivcontactlist.adapter=coursesAdapter

    }
}