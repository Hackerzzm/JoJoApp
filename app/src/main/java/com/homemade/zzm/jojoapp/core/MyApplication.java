package com.homemade.zzm.jojoapp.core;

import android.app.Application;
import android.content.Context;

/**
 * Created by zouzheming on 2017/6/12 15:28
 * 邮箱：920108874@qq.com
 * 手机：18352533507
 */
public class MyApplication extends Application {
  private Context appCtx;

  public static void exit() {

  }

  @Override public void onCreate() {
    super.onCreate();
    appCtx = getApplicationContext();
  }

  public Context getAppContext() {
    return appCtx;
  }
}
