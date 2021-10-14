package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wIZP2KYtaNrpfYwXm3WaRZdypx6Zg8efNqXpgBq0")
                .clientKey("NkhUc0eHpC1E6wUHm63ikyVqZCXTWNM6u5qmOFjz")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
