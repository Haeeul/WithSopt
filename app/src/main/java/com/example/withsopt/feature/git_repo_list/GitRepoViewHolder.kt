package com.example.withsopt.feature.git_repo_list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.withsopt.R
import com.example.withsopt.data.git_repo.GitRepoItem

class GitRepoViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    val txtTitle : TextView = view.findViewById(R.id.title)
    val txtDescription : TextView = view.findViewById(R.id.description)
    val imgColor : ImageView = view.findViewById(R.id.language_color)
    val txtLanguage : TextView = view.findViewById(R.id.language)

    fun bind(data: GitRepoItem){
        txtTitle.text = data.title
        txtDescription.text = data.desc
        txtLanguage.text = data.language
    }
}