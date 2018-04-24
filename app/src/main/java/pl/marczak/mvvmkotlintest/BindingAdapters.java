package pl.marczak.mvvmkotlintest;

import android.databinding.BindingAdapter;
import android.databinding.ObservableInt;
import android.widget.ImageView;

public class BindingAdapters {


    @BindingAdapter("imageRes")
    public static void setImageRes(ImageView imageView, ObservableInt res) {
        imageView.setImageResource(res.get());

    }
}
