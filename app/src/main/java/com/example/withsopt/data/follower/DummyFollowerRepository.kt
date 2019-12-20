package com.example.withsopt.data.follower

class DummyFollowerRepository {
    fun getUser() : List<FollowerItem> {
        return listOf(
            FollowerItem(
                ImageUrl = "",
                id = "Myid",
                name = "Myeong Hui Cheon"
            )
        )
    }

    fun getFollowerList() : List<FollowerItem>{
        return listOf(
            FollowerItem(
                ImageUrl = "",
                id = "Myid",
                name = "Myeong Hui Cheon"
            ),
            FollowerItem(
                ImageUrl = "",
                id = "Myid",
                name = "Myeong Hui Cheon"
            ),
            FollowerItem(
                ImageUrl = "",
                id = "Myid",
                name = "Myeong Hui Cheon"
            ),
            FollowerItem(
                ImageUrl = "",
                id = "Myid",
                name = "Myeong Hui Cheon"
            ),
            FollowerItem(
                ImageUrl = "",
                id = "Myid",
                name = "Myeong Hui Cheon"
            ),
            FollowerItem(
                ImageUrl = "",
                id = "Myid",
                name = "Myeong Hui Cheon"
            )
        )
    }
}