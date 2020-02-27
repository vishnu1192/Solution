package com.example.solution;

import com.example.solution.InterfacesImplementation.Implementation;
import com.example.solution.InterfacesImplementation.LoginModuleforGoogle;
import com.example.solution.InterfacesImplementation.LoginModuleforfacebook;

import dagger.BindsInstance;
import dagger.Component;


@Component(modules = {ModulesWorkingWith3rdpartyLibaries.class,LoginModuleforGoogle.class})
public interface RestApiComponent {

      //Demo1  RestApiComponent();


      void inject1(MainActivity mainActivity);


}

   /*   @Component.Builder

      interface Builder{



            @BindsInstance
            Builder  count(int val);
           // @BindsInstance
           // Builder name(String name);

            RestApiComponent build();


      }



      }


/* @Component.Builder
    interface Builder{

        @BindsInstance
        Builder count(int count);


        RestApiComponent build(); */








