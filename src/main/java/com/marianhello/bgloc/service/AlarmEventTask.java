package com.marianhello.bgloc;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import android.content.BroadcastReceiver;
import android.util.Log;

// import com.facebook.react.bridge.ReactApplicationContext;
// import com.facebook.react.bridge.ReactContext;
// import com.facebook.react.bridge.ReactContextBaseJavaModule;

// public class AlarmEventTask extends ReactContextBaseJavaModule {
public class AlarmEventTask {

  // private ReactContext mReactContext;
  // instance of our receiver
  private LocalBroadcastReceiver mLocalBroadcastReceiver;

  // public AlarmEventTask(ReactApplicationContext reactContext) {
  //   super(reactContext);
  //   this.mReactContext = reactContext;
  //   this.mLocalBroadcastReceiver = new LocalBroadcastReceiver();
  //   LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(reactContext);
  //   localBroadcastManager.registerReceiver(mLocalBroadcastReceiver, new IntentFilter("my-custom-event"));
  // }

  public AlarmEventTask(Context context) {
    Log.d("AlarmEventTask", "creating broadcast");
    this.mLocalBroadcastReceiver = new LocalBroadcastReceiver();
    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
    localBroadcastManager.registerReceiver(mLocalBroadcastReceiver, new IntentFilter("my-custom-event"));
  }

  public class LocalBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
      // String someData = intent.getStringExtra("my-extra-data");
      // mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
      //       .emit("alarm-event", someData);
      Log.d("AlarmEventTask", "alarm broadcast received");
    }
  }
}