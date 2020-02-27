package com.example.solution.InterfacesImplementation;

import android.media.FaceDetector;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;
@Module
 public class LoginModuleforGoogle {


    int count;
    public LoginModuleforGoogle(int count) {
        this.count = count;
    }



    @Provides
    int Providecountvalue () {


        return count;
    }





@Provides
    Implementation GoogleImplenetaion(Google google){


    return google;
}








    }
