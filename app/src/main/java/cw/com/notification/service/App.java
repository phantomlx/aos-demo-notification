package cw.com.notification.service;

import android.app.Application;
import android.telephony.data.ApnSetting;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;

import static android.content.ContentValues.TAG;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
