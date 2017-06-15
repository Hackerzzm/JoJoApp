package com.homemade.zzm.jojoapp.ui.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.homemade.zzm.jojoapp.R;
import com.homemade.zzm.jojoapp.core.BaseActivity;

public class MainActivity extends BaseActivity {

  private Toolbar mToolbar;
  private DrawerLayout mDrawerLayout;
  private ActionBarDrawerToggle mActionBarDrawerToggle;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mToolbar = (Toolbar) findViewById(R.id.toolbar);
    mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
    mActionBarDrawerToggle =
        new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open, R.string.close);
    mDrawerLayout.setDrawerListener(mActionBarDrawerToggle);
  }

  @Override protected void onPostCreate(Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    mActionBarDrawerToggle.syncState();
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    if (mActionBarDrawerToggle.onOptionsItemSelected(item)) {
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

  @Override public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    mActionBarDrawerToggle.onConfigurationChanged(newConfig);
  }
}
