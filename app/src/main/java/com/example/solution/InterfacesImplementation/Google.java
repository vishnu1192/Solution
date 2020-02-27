package com.example.solution.InterfacesImplementation;

import android.util.Log;

import javax.inject.Inject;

import dagger.Provides;



public class Google implements Implementation {
    private static final String TAG = "Google";

@Inject
    public Google(int value1) {
        this.value1 = value1;
    }
   public Google(String name) {
        this.name = name;
   }

    String name;

    int value1, value2;






    @Override
    public void login() {

        if (value1 > 100) {


            Log.d(TAG, "login: google login value 2:" + value2);

           // Log.d(TAG, "login: google login name:" + name);
        }

else

                Log.d(TAG, "login: Less than the value 1 is less than 100: "+ value1);




       // Log.d(TAG, "login: Name: "+ name);

    }}