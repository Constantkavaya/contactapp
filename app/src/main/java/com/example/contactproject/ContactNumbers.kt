package com.example.contactproject

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactNumbers (var contactLists: List<Contacts>,var  context: Context): RecyclerView.Adapter<ContactNumbers.ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_items, parent, false)
        return ContactsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var  addcontacts=contactLists.get(position)
        holder.tvnames.text=addcontacts.name
        holder.tvphonenumber.text=addcontacts.phoneNumber
        holder.tvemailing.text=addcontacts.email
        Picasso.get().load(addcontacts.imageurl)
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.imageContact)
        holder.cvcontacts.setOnClickListener{
            var  intent=Intent(context,activityviewdetailcontact::class.java)
            intent.putExtra("name",addcontacts.name)
            intent.putExtra("email",addcontacts.email)
            intent.putExtra("phone",addcontacts.phoneNumber)
            intent.putExtra("image",addcontacts.imageurl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
             context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
       return contactLists.size
    }
    class  ContactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvnames=itemView.findViewById<TextView>(R.id.tvname)
        var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphone)
        var tvemailing=itemView.findViewById<TextView>(R.id.tvemail)
        var  imageContact=itemView.findViewById<ImageView>(R.id.imgcontact)
        var  cvcontacts=itemView.findViewById<CardView>(R.id.cvcontacts)

    }

}



























































































































































































