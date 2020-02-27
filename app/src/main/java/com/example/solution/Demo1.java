package com.example.solution;

import android.nfc.Tag;
import android.util.Log;

import com.example.solution.InterfacesImplementation.Facebook;
import com.example.solution.InterfacesImplementation.Google;
import com.example.solution.InterfacesImplementation.Implementation;
import com.example.solution.InterfacesImplementation.LoginModuleforGoogle;
import com.example.solution.InterfacesImplementation.LoginModuleforfacebook;

import java.lang.annotation.Target;

import javax.inject.Inject;

public class Demo1 {

    protected Demo2 demo2;
    Google google;


    Implementation implementation;

    @Inject Demo3 demo3;

    private static final String TAG = "Dependency injection";
@Inject
public Demo1(Demo2 demo2, Implementation implementation ){


    this.demo2 = demo2;
    this.implementation = implementation;


}



@Inject
    public void  Demo1method() {





       // demo2.Demo2method();
        Log.d(TAG, "Demo1method: is running");

    implementation.login();

   google.login();

    //google.login();
    }




    @Inject
    public void Callingstartrunmethod(StartTheRun startTheRun){

    startTheRun.Starttheprocess(this);

    }

}
