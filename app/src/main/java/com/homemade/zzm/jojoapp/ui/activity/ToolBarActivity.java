package com.homemade.zzm.jojoapp.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;
import com.homemade.zzm.jojoapp.R;
import com.homemade.zzm.jojoapp.core.BaseActivity;

public class ToolBarActivity extends BaseActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tool_bar);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    toolbar.setNavigationIcon(R.drawable.ic_drawer_home);//设置导航栏图标
    toolbar.setLogo(R.mipmap.ic_launcher);//设置app logo
    toolbar.setTitle("Title");//设置主标题
    toolbar.setSubtitle("Subtitle");//设置子标题
    toolbar.inflateMenu(R.menu.base_toolbar_menu);//设置右上角的填充菜单
    toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
      @Override public boolean onMenuItemClick(MenuItem item) {
        int menuItemId = item.getItemId();
        if (menuItemId == R.id.action_search) {
          Toast.makeText(ToolBarActivity.this, R.string.menu_search, Toast.LENGTH_SHORT).show();
        } else if (menuItemId == R.id.action_notification) {
          Toast.makeText(ToolBarActivity.this, R.string.menu_notifications, Toast.LENGTH_SHORT)
              .show();
        } else if (menuItemId == R.id.action_item1) {
          Toast.makeText(ToolBarActivity.this, R.string.item_01, Toast.LENGTH_SHORT).show();
        } else if (menuItemId == R.id.action_item2) {
          Toast.makeText(ToolBarActivity.this, R.string.item_02, Toast.LENGTH_SHORT).show();
        }
        return true;
      }
    });
  }
}
