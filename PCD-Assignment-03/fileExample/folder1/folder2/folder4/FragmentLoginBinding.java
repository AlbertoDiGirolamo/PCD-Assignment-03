// Generated by view binder compiler. Do not edit!
package com.example.progettomobile_07_05.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.progettomobile_07_05.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout fragmentLogin;

  @NonNull
  public final ImageButton infologin;

  @NonNull
  public final TextView linkregister;

  @NonNull
  public final Button loginbutton;

  @NonNull
  public final EditText maillogin;

  @NonNull
  public final EditText passwordlogin;

  @NonNull
  public final TextView signin;

  private FragmentLoginBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout fragmentLogin, @NonNull ImageButton infologin,
      @NonNull TextView linkregister, @NonNull Button loginbutton, @NonNull EditText maillogin,
      @NonNull EditText passwordlogin, @NonNull TextView signin) {
    this.rootView = rootView;
    this.fragmentLogin = fragmentLogin;
    this.infologin = infologin;
    this.linkregister = linkregister;
    this.loginbutton = loginbutton;
    this.maillogin = maillogin;
    this.passwordlogin = passwordlogin;
    this.signin = signin;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout fragmentLogin = (RelativeLayout) rootView;

      id = R.id.infologin;
      ImageButton infologin = ViewBindings.findChildViewById(rootView, id);
      if (infologin == null) {
        break missingId;
      }

      id = R.id.linkregister;
      TextView linkregister = ViewBindings.findChildViewById(rootView, id);
      if (linkregister == null) {
        break missingId;
      }

      id = R.id.loginbutton;
      Button loginbutton = ViewBindings.findChildViewById(rootView, id);
      if (loginbutton == null) {
        break missingId;
      }

      id = R.id.maillogin;
      EditText maillogin = ViewBindings.findChildViewById(rootView, id);
      if (maillogin == null) {
        break missingId;
      }

      id = R.id.passwordlogin;
      EditText passwordlogin = ViewBindings.findChildViewById(rootView, id);
      if (passwordlogin == null) {
        break missingId;
      }

      id = R.id.signin;
      TextView signin = ViewBindings.findChildViewById(rootView, id);
      if (signin == null) {
        break missingId;
      }

      return new FragmentLoginBinding((RelativeLayout) rootView, fragmentLogin, infologin,
          linkregister, loginbutton, maillogin, passwordlogin, signin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
