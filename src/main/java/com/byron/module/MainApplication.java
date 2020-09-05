package com.byron.module;

import android.app.Application;

import com.byron.base.router.RouterUtils;
import com.byron.business_a.BusinessAProvider;
import com.byron.business_b.BusinessBProvider;

/**
 * 工程的application
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RouterUtils.registerRouter("business_b", new BusinessBProvider());
        RouterUtils.registerRouter("business_a", new BusinessAProvider());
    }
}
