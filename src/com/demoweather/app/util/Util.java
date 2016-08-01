package com.demoweather.app.util;

import java.lang.ref.WeakReference;

import android.content.Context;
import android.widget.Toast;

public class Util {

    private static Toast toast;

    private Util() {
    }

    public static void showToast(Context context, String text) {
        WeakReference<Context> wr = new WeakReference<>(context);
        if (toast == null) {
            toast = Toast.makeText(wr.get(), text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

}
