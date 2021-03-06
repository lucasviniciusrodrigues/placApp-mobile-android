package com.ghostapps.placapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ghostapps.placapp.databinding.ActivityGameRecordsBindingImpl;
import com.ghostapps.placapp.databinding.ActivityHomeBindingImpl;
import com.ghostapps.placapp.databinding.ActivityLoginBindingImpl;
import com.ghostapps.placapp.databinding.ActivityPreGameBindingImpl;
import com.ghostapps.placapp.databinding.ActivityScoreGameBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYGAMERECORDS = 1;

  private static final int LAYOUT_ACTIVITYHOME = 2;

  private static final int LAYOUT_ACTIVITYLOGIN = 3;

  private static final int LAYOUT_ACTIVITYPREGAME = 4;

  private static final int LAYOUT_ACTIVITYSCOREGAME = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ghostapps.placapp.R.layout.activity_game_records, LAYOUT_ACTIVITYGAMERECORDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ghostapps.placapp.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ghostapps.placapp.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ghostapps.placapp.R.layout.activity_pre_game, LAYOUT_ACTIVITYPREGAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ghostapps.placapp.R.layout.activity_score_game, LAYOUT_ACTIVITYSCOREGAME);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYGAMERECORDS: {
          if ("layout/activity_game_records_0".equals(tag)) {
            return new ActivityGameRecordsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_game_records is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPREGAME: {
          if ("layout/activity_pre_game_0".equals(tag)) {
            return new ActivityPreGameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pre_game is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSCOREGAME: {
          if ("layout/activity_score_game_0".equals(tag)) {
            return new ActivityScoreGameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_score_game is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_game_records_0", com.ghostapps.placapp.R.layout.activity_game_records);
      sKeys.put("layout/activity_home_0", com.ghostapps.placapp.R.layout.activity_home);
      sKeys.put("layout/activity_login_0", com.ghostapps.placapp.R.layout.activity_login);
      sKeys.put("layout/activity_pre_game_0", com.ghostapps.placapp.R.layout.activity_pre_game);
      sKeys.put("layout/activity_score_game_0", com.ghostapps.placapp.R.layout.activity_score_game);
    }
  }
}
