package com.raman.snapchatclonex.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.amazonaws.mobile.client.AWSMobileClient;
import com.amplifyframework.auth.AuthChannelEventName;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.InitializationStatus;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.SubscriptionToken;
import com.raman.snapchatclonex.MainActivity;
import com.raman.snapchatclonex.R;
import com.raman.snapchatclonex.auth.LoginFragment;

public class LoginActivity extends AppCompatActivity implements LoginFragment.LoginCompleteListener {

    private static final String TAG = "LoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i(TAG,"onCreate");
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.login2_container, new LoginFragment())
                .commit();
        setResult(MainActivity.NOT_SIGNED_IN);//default result
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    public void OnUserSignedIn() {
        setResult(MainActivity.SIGNED_IN);
        finish();
    }
}