package com.eslam.roomdb_simpleapp;

import androidx.room.TypeConverter;

import com.google.gson.Gson;

class Converters {

    @TypeConverter
    public String fromPostToJson(Post post){
        return new Gson().toJson(post);
    }

    @TypeConverter
    public Post fromJsonToPost(String stringPost){
        return new Gson().fromJson(stringPost,Post.class);
    }
}
