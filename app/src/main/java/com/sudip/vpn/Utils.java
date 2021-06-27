package com.sudip.vpn;

import android.net.Uri;

public class Utils {
    public static String getImgURL(int resourceId) {
        return Uri.parse("android.resource://" + R.class.getPackage().getName() + "/" + resourceId).toString();
    }
}
