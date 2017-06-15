package com.homemade.zzm.jojoapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import com.homemade.zzm.jojoapp.R;
import com.homemade.zzm.jojoapp.core.BaseActivity;
import java.util.Timer;
import java.util.TimerTask;

public class LauncherActivity extends BaseActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_launcher);
    Timer timer = new Timer();
    TimerTask timerTask = new TimerTask() {
      @Override public void run() {
        Intent intent1 = new Intent(LauncherActivity.this, MainActivity.class);
        startActivity(intent1);
        LauncherActivity.this.finish();
      }
    };
    timer.schedule(timerTask, 1000 * 1);
  }
}
