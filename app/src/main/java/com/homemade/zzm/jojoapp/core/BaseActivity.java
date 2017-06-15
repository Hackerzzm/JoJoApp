package com.homemade.zzm.jojoapp.core;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

/**
 * Created by zouzheming on 2017/6/12 15:34
 * 邮箱：920108874@qq.com
 * 手机：18352533507
 */
public class BaseActivity extends AppCompatActivity {
  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
  }
}
