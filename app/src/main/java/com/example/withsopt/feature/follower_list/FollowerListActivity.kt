package com.example.withsopt.feature.follower_list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.withsopt.R
import com.example.withsopt.data.follower.DummyFollowerRepository
import com.example.withsopt.feature.user_profile.UserProfile

class FollowerListActivity : AppCompatActivity() {
    private lateinit var rvFollowerList : RecyclerView
    private lateinit var followerAdapter : FollowerAdapter
    private var folloserRepository = DummyFollowerRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_follower_list)

        makeProfile()

        rvFollowerList = findViewById(R.id.rv_gitrepo_list)

        followerAdapter = FollowerAdapter(this)

        rvFollowerList.adapter = followerAdapter

        rvFollowerList.layoutManager = LinearLayoutManager(this)

        followerAdapter.data = folloserRepository.getFollowerList()

        followerAdapter.notifyDataSetChanged()
    }

    private fun makeProfile(){
        val fragment2 = UserProfile()
        fragment2.Username = "팔로워리스트에 있는 프로필입니다!"

        val transaction = supportFragmentManager.beginTransaction()

        transaction.add(R.id.userprofile_container,fragment2)

        transaction.commit()
    }
}
