package com.example.home.ui.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.home.R
import com.google.android.material.circularreveal.CircularRevealGridLayout

class HomeInformationViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    val profileImage: ImageView = itemView.findViewById(R.id.profile_image)
    val profileLink: TextView = itemView.findViewById(R.id.profile_link)
    val name: TextView = itemView.findViewById(R.id.name)
    val email: TextView = itemView.findViewById(R.id.email)
    val status: TextView = itemView.findViewById(R.id.status)
    val phone: TextView = itemView.findViewById(R.id.phone)
   // val id: TextView = itemView.findViewById(R.id.id)
    val informationView: CardView = itemView.findViewById(R.id.informationView)
}
