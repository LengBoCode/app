package com.byron.module;

import android.app.Application;

import com.byron.base.router.Dispatcher;
import com.byron.business_a.BusinessAReceiver;
import com.byron.business_b.BusinessBReceiver;

/**
 * 工程的application
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Dispatcher.registerReceiver("business_b",  // receiver名称
                new BusinessBReceiver()); // receiver执行对象
        Dispatcher.registerReceiver("business_a",
                new BusinessAReceiver());
    }
}
