package com.nghiatt.demobinding.adapter;

import android.databinding.BindingAdapter;
import android.widget.TextView;

public class BindingAdapters {
    @BindingAdapter("text")
    public static void setText(TextView textView, String text) {
        textView.setText("custom attr item " + text);
    }
}
