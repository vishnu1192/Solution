package com.example.solution.InterfacesImplementation;

import android.provider.ContactsContract;
import android.util.Log;

import javax.inject.Inject;

public class Facebook implements Implementation {
    private static final String TAG = "Facebook";

    int count;

//Implementation implementation;

   @Inject
    public Facebook(int count) {
        this.count = count;

    }





    @Override
    public void login() {


        Log.d(TAG, "login from : Facebook"+"/n"+count);
        
        
    }
}
