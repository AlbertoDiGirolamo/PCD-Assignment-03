// Generated by view binder compiler. Do not edit!
package com.example.progettomobile_07_05.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.progettomobile_07_05.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddProductBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Button captureButton;

  @NonNull
  public final TextInputEditText descriptionEdittext;

  @NonNull
  public final TextInputLayout descriptionTextinput;

  @NonNull
  public final ImageButton gpsButton;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final Button loadPictureButton;

  @NonNull
  public final ImageView pictureDisplayedImageview;

  @NonNull
  public final EditText priceEdittext;

  @NonNull
  public final TextInputLayout priceTextinput;

  @NonNull
  public final TextInputEditText productNameEdittext;

  @NonNull
  public final TextInputLayout productNameTextinput;

  @NonNull
  public final TextInputEditText productPositionEdittext;

  @NonNull
  public final TextInputLayout productPositionTextinput;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView txtoppure;

  @NonNull
  public final TextView vuto;

  private AddProductBinding(@NonNull CoordinatorLayout rootView, @NonNull Button captureButton,
      @NonNull TextInputEditText descriptionEdittext, @NonNull TextInputLayout descriptionTextinput,
      @NonNull ImageButton gpsButton, @NonNull Guideline guideline,
      @NonNull Button loadPictureButton, @NonNull ImageView pictureDisplayedImageview,
      @NonNull EditText priceEdittext, @NonNull TextInputLayout priceTextinput,
      @NonNull TextInputEditText productNameEdittext, @NonNull TextInputLayout productNameTextinput,
      @NonNull TextInputEditText productPositionEdittext,
      @NonNull TextInputLayout productPositionTextinput, @NonNull ScrollView scrollView2,
      @NonNull TextView txtoppure, @NonNull TextView vuto) {
    this.rootView = rootView;
    this.captureButton = captureButton;
    this.descriptionEdittext = descriptionEdittext;
    this.descriptionTextinput = descriptionTextinput;
    this.gpsButton = gpsButton;
    this.guideline = guideline;
    this.loadPictureButton = loadPictureButton;
    this.pictureDisplayedImageview = pictureDisplayedImageview;
    this.priceEdittext = priceEdittext;
    this.priceTextinput = priceTextinput;
    this.productNameEdittext = productNameEdittext;
    this.productNameTextinput = productNameTextinput;
    this.productPositionEdittext = productPositionEdittext;
    this.productPositionTextinput = productPositionTextinput;
    this.scrollView2 = scrollView2;
    this.txtoppure = txtoppure;
    this.vuto = vuto;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.capture_button;
      Button captureButton = ViewBindings.findChildViewById(rootView, id);
      if (captureButton == null) {
        break missingId;
      }

      id = R.id.description_edittext;
      TextInputEditText descriptionEdittext = ViewBindings.findChildViewById(rootView, id);
      if (descriptionEdittext == null) {
        break missingId;
      }

      id = R.id.description_textinput;
      TextInputLayout descriptionTextinput = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTextinput == null) {
        break missingId;
      }

      id = R.id.gps_button;
      ImageButton gpsButton = ViewBindings.findChildViewById(rootView, id);
      if (gpsButton == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.load_picture_button;
      Button loadPictureButton = ViewBindings.findChildViewById(rootView, id);
      if (loadPictureButton == null) {
        break missingId;
      }

      id = R.id.picture_displayed_imageview;
      ImageView pictureDisplayedImageview = ViewBindings.findChildViewById(rootView, id);
      if (pictureDisplayedImageview == null) {
        break missingId;
      }

      id = R.id.price_edittext;
      EditText priceEdittext = ViewBindings.findChildViewById(rootView, id);
      if (priceEdittext == null) {
        break missingId;
      }

      id = R.id.price_textinput;
      TextInputLayout priceTextinput = ViewBindings.findChildViewById(rootView, id);
      if (priceTextinput == null) {
        break missingId;
      }

      id = R.id.product_name_edittext;
      TextInputEditText productNameEdittext = ViewBindings.findChildViewById(rootView, id);
      if (productNameEdittext == null) {
        break missingId;
      }

      id = R.id.product_name_textinput;
      TextInputLayout productNameTextinput = ViewBindings.findChildViewById(rootView, id);
      if (productNameTextinput == null) {
        break missingId;
      }

      id = R.id.product_position_edittext;
      TextInputEditText productPositionEdittext = ViewBindings.findChildViewById(rootView, id);
      if (productPositionEdittext == null) {
        break missingId;
      }

      id = R.id.product_position_textinput;
      TextInputLayout productPositionTextinput = ViewBindings.findChildViewById(rootView, id);
      if (productPositionTextinput == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.txtoppure;
      TextView txtoppure = ViewBindings.findChildViewById(rootView, id);
      if (txtoppure == null) {
        break missingId;
      }

      id = R.id.vuto;
      TextView vuto = ViewBindings.findChildViewById(rootView, id);
      if (vuto == null) {
        break missingId;
      }

      return new AddProductBinding((CoordinatorLayout) rootView, captureButton, descriptionEdittext,
          descriptionTextinput, gpsButton, guideline, loadPictureButton, pictureDisplayedImageview,
          priceEdittext, priceTextinput, productNameEdittext, productNameTextinput,
          productPositionEdittext, productPositionTextinput, scrollView2, txtoppure, vuto);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
