package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.solution.InterfacesImplementation.Facebook;
import com.example.solution.InterfacesImplementation.Google;
import com.example.solution.InterfacesImplementation.Implementation;

import com.example.solution.InterfacesImplementation.LoginModuleforGoogle;
import com.example.solution.InterfacesImplementation.LoginModuleforfacebook;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {
    @Inject
     Demo1 demo1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Demo2 demo2 = new Demo2();
//Demo3 demo3 = new Demo3();

        Facebook facebook;




        RestApiComponent restApiComponent = DaggerRestApiComponent.builder().build();







        //RestApiComponent restApiComponent = DaggerRestApiComponent
;        //demo1 = restApiComponent.RestApiComponent();

restApiComponent.inject1(this);

        demo1.Demo1method();




       // demo1.demo2.Demo2method();
         //demo1.demo3.Demo3method();
        //demo1 = new Demo1(demo2, demo3);
       // demo1.Demo1method();
        //demo1.demo3.Demo3method();




    }
}
