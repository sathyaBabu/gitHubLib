package com.sathya.gittoast;

import android.content.Context;
import android.widget.Toast;

public class Tosta {

    public static void GitToast(Context context, String msg){
        Toast.makeText(context, "Git : "+msg, Toast.LENGTH_SHORT).show();
    }

}
