package com.eslam.roomdb_simpleapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

@Database(entities = Post.class , version = 1)
@TypeConverters(Converters.class)
abstract class PostDatabase extends RoomDatabase {

    private static PostDatabase instance;
    public abstract PostDao dao();


    public static synchronized PostDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, PostDatabase.class, "posts_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

}
