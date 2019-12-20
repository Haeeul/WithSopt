package com.example.withsopt.feature.git_repo_list

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.withsopt.R
import com.example.withsopt.data.git_repo.GitRepoItem

class GitRepoAdapter (private val context: Context) : RecyclerView.Adapter<GitRepoViewHolder>(){

    var data = listOf<GitRepoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitRepoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_git_repo,parent,false)

        return GitRepoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: GitRepoViewHolder, position: Int) {
        holder.bind(data[position])
    }
}