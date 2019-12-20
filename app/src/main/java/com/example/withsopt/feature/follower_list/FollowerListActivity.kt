package com.example.withsopt.feature.follower_list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.withsopt.R
import com.example.withsopt.data.follower.DummyFollowerRepository

class FollowerListActivity : AppCompatActivity() {
    private lateinit var rvFollowerList : RecyclerView
    private lateinit var followerAdapter : FollowerAdapter
    private var folloserRepository = DummyFollowerRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_follower_list)

        rvFollowerList = findViewById(R.id.rv_follower_list)

        followerAdapter = FollowerAdapter(this)

        rvFollowerList.adapter = followerAdapter

        rvFollowerList.layoutManager = LinearLayoutManager(this)

        followerAdapter.data = folloserRepository.getFollowerList()

        followerAdapter.notifyDataSetChanged()
    }
}
