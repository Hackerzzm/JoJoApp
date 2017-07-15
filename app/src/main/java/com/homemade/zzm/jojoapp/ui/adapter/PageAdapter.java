package com.homemade.zzm.jojoapp.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.homemade.zzm.jojoapp.ui.fragment.ChapterBriefFragment;
import com.homemade.zzm.jojoapp.ui.fragment.CharactorInfoFragment;
import com.homemade.zzm.jojoapp.ui.fragment.ImportantConceptionFragment;
import com.homemade.zzm.jojoapp.ui.fragment.MainSceneItemFragment;
import com.homemade.zzm.jojoapp.ui.fragment.MapFragment;
import com.homemade.zzm.jojoapp.ui.fragment.TimeLineFragment;

/**
 * Created by zouzheming on 2017/6/21 15:33
 * 邮箱：920108874@qq.com
 * 手机：18352533507
 */
public class PageAdapter extends FragmentStatePagerAdapter {
  int nNumOfTabs;

  public PageAdapter(FragmentManager fm, int nNumOfTabs) {
    super(fm);
    this.nNumOfTabs = nNumOfTabs;
  }

  @Override public Fragment getItem(int position) {
    switch (position) {
      case 0:
        CharactorInfoFragment tab1 = new CharactorInfoFragment();
        return tab1;
      case 1:
        ChapterBriefFragment tab2 = new ChapterBriefFragment();
        return tab2;
      case 2:
        ImportantConceptionFragment tab3 = new ImportantConceptionFragment();
        return tab3;
      case 3:
        MainSceneItemFragment tab4 = new MainSceneItemFragment();
        return tab4;
      case 4:
        MapFragment tab5 = new MapFragment();
        return tab5;
      case 5:
        TimeLineFragment tab6 = new TimeLineFragment();
        return tab6;
    }
    return null;
  }

  @Override public int getCount() {
    return nNumOfTabs;
  }
}