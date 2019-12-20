package com.example.withsopt.feature.follower_list

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.withsopt.R
import com.example.withsopt.data.follower.FollowerItem
import com.example.withsopt.feature.git_repo_list.GitRepoListActivity

class FollowerViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val profileImage: ImageView = view.findViewById(R.id.profile_image)
    val txtprofileId: TextView = view.findViewById(R.id.profile_id)
    val txtprofileName: TextView = view.findViewById(R.id.profile_name)

    fun onBind(user: FollowerItem) {
        txtprofileId.text = user.id
        txtprofileName.text = user.name

        // 아이템 클릭 시, 해당 팔로워 레포리스트 화면으로 이동
        itemView.setOnClickListener {
            val context = it.context
            val intent = Intent(context, GitRepoListActivity::class.java)

            // 선택한 팔로워 이름을 전달
            intent.putExtra("follower_name", user.id)

            context.startActivity(intent)
        }
    }
}