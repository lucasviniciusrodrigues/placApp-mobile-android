// Generated by data binding compiler. Do not edit!
package com.ghostapps.placapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ghostapps.placapp.R;
import com.ghostapps.placapp.viewModel.home.HomeViewModel;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityHomeBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton homeExitButton;

  @NonNull
  public final TextView homeMessage;

  @NonNull
  public final MaterialButton homeNewGameButton;

  @NonNull
  public final TextView homeTitle;

  @Bindable
  protected HomeViewModel mViewModel;

  protected ActivityHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton homeExitButton, TextView homeMessage, MaterialButton homeNewGameButton,
      TextView homeTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.homeExitButton = homeExitButton;
    this.homeMessage = homeMessage;
    this.homeNewGameButton = homeNewGameButton;
    this.homeTitle = homeTitle;
  }

  public abstract void setViewModel(@Nullable HomeViewModel viewModel);

  @Nullable
  public HomeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityHomeBinding>inflateInternal(inflater, R.layout.activity_home, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityHomeBinding>inflateInternal(inflater, R.layout.activity_home, null, false, component);
  }

  public static ActivityHomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityHomeBinding)bind(component, view, R.layout.activity_home);
  }
}
