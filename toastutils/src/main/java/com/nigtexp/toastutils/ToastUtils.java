package com.nigtexp.toastutils;

import android.content.Context;
import android.widget.Toast;

/**
 * @author ChrisLiu
 * @since 2020/6/17
 */
public class ToastUtils {
    public static void showShort(Context context,String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(Context context,String text){
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}
