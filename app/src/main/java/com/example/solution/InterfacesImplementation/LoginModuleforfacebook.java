package com.example.solution.InterfacesImplementation;

import android.util.Log;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class LoginModuleforfacebook  {

@Binds
    abstract Implementation impFacebook(Facebook facebook);




}

