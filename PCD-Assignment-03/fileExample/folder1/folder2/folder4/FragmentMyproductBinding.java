// Generated by view binder compiler. Do not edit!
package com.example.progettomobile_07_05.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.progettomobile_07_05.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentMyproductBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout fragmentMyproduct;

  private FragmentMyproductBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout fragmentMyproduct) {
    this.rootView = rootView;
    this.fragmentMyproduct = fragmentMyproduct;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyproductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyproductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_myproduct, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyproductBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    LinearLayout fragmentMyproduct = (LinearLayout) rootView;

    return new FragmentMyproductBinding((LinearLayout) rootView, fragmentMyproduct);
  }
}
