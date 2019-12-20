package com.example.withsopt.feature.follower_list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.withsopt.R
import com.example.withsopt.data.follower.FollowerItem

class FollowerViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val profileImage: ImageView = view.findViewById(R.id.profile_image)
    val profileId: TextView = view.findViewById(R.id.profile_id)
    val profileName: TextView = view.findViewById(R.id.profile_name)

    fun onBind(user: FollowerItem) {
        profileId.text = user.id
        profileName.text = user.name
    }
}