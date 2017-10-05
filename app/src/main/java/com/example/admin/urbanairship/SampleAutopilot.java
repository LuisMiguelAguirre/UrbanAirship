package com.example.admin.urbanairship;

import android.content.Context;
import android.support.annotation.NonNull;

import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;


public class SampleAutopilot extends com.urbanairship.Autopilot {

    @Override
    public void onAirshipReady(@NonNull UAirship airship) {
        airship.getPushManager().setUserNotificationsEnabled(true);
        UAirship.shared().getPushManager().setUserNotificationsEnabled(true);

    }

    @Override
    public AirshipConfigOptions createAirshipConfigOptions(@NonNull Context context) {
        AirshipConfigOptions options = new AirshipConfigOptions.Builder()
                .setDevelopmentAppKey("xD6tCrXmRVikiVkl6of3iw")
                .setDevelopmentAppSecret("xpoPPFI9TtqxOymeOi9fgg")
                .setProductionAppKey("Your Production App Key")
                .setProductionAppSecret("Your Production App Secret")
                .setInProduction(false)
                .setGcmSender("857488499255") // FCM/GCM sender ID
                .setNotificationIcon(R.mipmap.ic_launcher)
                .setNotificationChannel("customChannel")
                .build();

        return options;
    }
}
