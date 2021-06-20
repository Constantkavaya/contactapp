package com.example.contactproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactNumbers (var contactLists: List<Contacts>): RecyclerView.Adapter<ContactNumbers.ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_items, parent, false)
        return ContactsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var  addcontacts=contactLists.get(position)
        holder.tvnames.text=addcontacts.name
        holder.tvphonenumber.text=addcontacts.phoneNumber
        holder.tvemailing.text=addcontacts.email



    }

    override fun getItemCount(): Int {
       return contactLists.size
    }
    class  ContactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvnames=itemView.findViewById<TextView>(R.id.tvname)
        var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphone)
        var tvemailing=itemView.findViewById<TextView>(R.id.tvemail)

    }

}