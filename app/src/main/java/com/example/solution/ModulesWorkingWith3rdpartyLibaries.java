package com.example.solution;

import dagger.Module;
import dagger.Provides;

@Module
public class ModulesWorkingWith3rdpartyLibaries {

@Provides
 Demo5 provideDemo5(){

    return new Demo5();
}

@Provides
 Demo6 providesDemo6(){


   Demo6 providesDemo6Object = new
           Demo6();


   providesDemo6Object.methodtocheckDemo6();
   return providesDemo6Object;


}




@Provides
 Demo4 ProvidesImplementation(Demo5 demo5, Demo6 demo6){


    return new Demo4(demo5, demo6);
    }
}
