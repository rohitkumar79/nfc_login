package com.example.rohit.nfc_login;
import com.parse.Parse;
import com.parse.ParseACL;

import com.parse.ParseInstallation;
import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "uYOJo1TJLnBJWh7dAMIw5SgkW9SMaXYgGfdX49nh", "TP01QDt0NSSN99NtouSrVZCOuv75ZtxtWgsSS103");
        //ParseInstallation.getCurrentInstallation().saveInBackground();
        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}