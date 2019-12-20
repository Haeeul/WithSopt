package com.example.withsopt.feature.git_repo_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.withsopt.R
import com.example.withsopt.data.git_repo.DummyGitRepoRepository

class GitRepoListActivity : AppCompatActivity() {

    private lateinit var rvGitRepo : RecyclerView
    private lateinit var gitRepoAdapter : GitRepoAdapter
    private var gitRepoRepository = DummyGitRepoRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git_repo_list)

        rvGitRepo = findViewById(R.id.rv_gitrepo_list)

        gitRepoAdapter = GitRepoAdapter(this)

        rvGitRepo.adapter = gitRepoAdapter

        rvGitRepo.layoutManager = LinearLayoutManager(this)

        gitRepoAdapter.data = gitRepoRepository.getRepoList()

        gitRepoAdapter.notifyDataSetChanged()
    }
}
