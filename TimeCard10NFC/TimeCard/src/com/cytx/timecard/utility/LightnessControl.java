package com.cytx.timecard.utility;


import android.app.Activity;
import android.content.ContentResolver;
import android.provider.Settings;
import android.provider.Settings.System;
import android.view.WindowManager;

public class LightnessControl
{

    public static boolean isAutoBrightness(Activity act) {
        boolean automicBrightness = false;
        ContentResolver aContentResolver = act.getContentResolver();
        try {
            automicBrightness = Settings.System.getInt(aContentResolver,
                    Settings.System.SCREEN_BRIGHTNESS_MODE) == Settings.System.SCREEN_BRIGHTNESS_MODE_AUTOMATIC;
        } catch (Exception e) {
            e.printStackTrace();
            DebugClass.displayCurrentStack("Can not get lightness");
        }
        return automicBrightness;
    }

    public static void SetLightness(Activity act,int value)
    {
        try {
            System.putInt(act.getContentResolver(),System.SCREEN_BRIGHTNESS,value);
            WindowManager.LayoutParams lp = act.getWindow().getAttributes();
            lp.screenBrightness = (value<=0?1:value) / 255f;
            act.getWindow().setAttributes(lp);
        } catch (Exception e) {
            e.printStackTrace();
            DebugClass.displayCurrentStack("Cannot set lightness");
        }
    }

    public static int GetLightness(Activity act)
    {
        return System.getInt(act.getContentResolver(),System.SCREEN_BRIGHTNESS,-1);
    }

    public static void stopAutoBrightness(Activity activity) {
        Settings.System.putInt(activity.getContentResolver(),
                Settings.System.SCREEN_BRIGHTNESS_MODE,
                Settings.System.SCREEN_BRIGHTNESS_MODE_MANUAL);
    }

    public static void startAutoBrightness(Activity activity) {
        Settings.System.putInt(activity.getContentResolver(),
                Settings.System.SCREEN_BRIGHTNESS_MODE,
                Settings.System.SCREEN_BRIGHTNESS_MODE_AUTOMATIC);
    }
}