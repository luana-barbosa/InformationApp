package com.example.home.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.home.R
import com.example.home.data.response.HomeInformationModel
import com.example.home.databinding.InformationListItemBinding
import com.example.home.orEmptyEmail
import com.example.home.orEmptyLink
import com.example.home.orEmptyName
import com.example.home.orEmptyPhone
import com.example.home.orEmptyStatus
import com.example.home.ui.viewholder.HomeInformationViewHolder
import com.squareup.picasso.Picasso

class HomeInformationAdapter (
    private val informationModelItemList: List<HomeInformationModel>,
) : RecyclerView.Adapter<HomeInformationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeInformationViewHolder {
        val view = InformationListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeInformationViewHolder(view.root)
    }

    override fun onBindViewHolder(holder: HomeInformationViewHolder, position: Int) {
        with(informationModelItemList[position]) {
            if (profileImage.isNotEmpty())
                Picasso.get().load(profileImage).placeholder(R.mipmap.ic_monkey).into(holder.profileImage)
            holder.name.text = name.orEmptyName()
            holder.email.text = email.orEmptyEmail()
            holder.status.text = status.orEmptyStatus()
            holder.phone.text = phone.orEmptyPhone()
            holder.profileLink.text = profileLink.orEmptyLink()
        }
    }

    override fun getItemCount(): Int = informationModelItemList.size
}