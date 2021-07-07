package com.example.signalstrength;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public class MainActivity extends AppCompatActivity {

    TelephonyManager mTelephonyManager;
    MyPhoneStateListener mPhoneStatelistener;
    int mSignalStrength = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mPhoneStatelistener = new MyPhoneStateListener();
        mTelephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        mTelephonyManager.listen(mPhoneStatelistener, PhoneStateListener.LISTEN_SIGNAL_STRENGTHS);
    }
}