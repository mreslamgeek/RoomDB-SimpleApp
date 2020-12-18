package com.eslam.roomdb_simpleapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "post_table")
class Post {
    private final int userId;
    private final String title;
    private final String body;
    @PrimaryKey(autoGenerate = true)
    private int _id;

    public Post(int userId, String title, String body) {
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
