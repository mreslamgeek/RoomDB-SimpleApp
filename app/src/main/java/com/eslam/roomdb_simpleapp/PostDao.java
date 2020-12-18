package com.eslam.roomdb_simpleapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
interface PostDao {
    @Insert
    void insertPost(Post post);

    @Query("select * from post_table")
    List<Post> getPosts();

}
