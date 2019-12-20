package com.example.withsopt.feature.git_repo_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.withsopt.R
import com.example.withsopt.data.git_repo.DummyGitRepoRepository
import com.example.withsopt.feature.user_profile.UserProfile

class GitRepoListActivity : AppCompatActivity() {

    private lateinit var rvGitRepo : RecyclerView
    private lateinit var gitRepoAdapter : GitRepoAdapter
    private var gitRepoRepository = DummyGitRepoRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git_repo_list)

        makeProfile()

        rvGitRepo = findViewById(R.id.rv_gitrepo_list)

        gitRepoAdapter = GitRepoAdapter(this)

        rvGitRepo.adapter = gitRepoAdapter

        rvGitRepo.layoutManager = LinearLayoutManager(this)

        gitRepoAdapter.data = gitRepoRepository.getRepoList()

        gitRepoAdapter.notifyDataSetChanged()
    }

    private fun makeProfile(){
        val fragment1 = UserProfile()
        fragment1.Username = "레포리스트에 있는 프로필입니다!"

        val transaction = supportFragmentManager.beginTransaction()

        transaction.add(R.id.userprofile_container,fragment1)

        transaction.commit()
    }
}
