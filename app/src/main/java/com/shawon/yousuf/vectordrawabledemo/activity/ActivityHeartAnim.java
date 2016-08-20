package com.shawon.yousuf.vectordrawabledemo.activity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.shawon.yousuf.vectordrawabledemo.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ActivityHeartAnim extends AppCompatActivity {

    @Bind(R.id.imageView)
    ImageView imageView;

    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_heart_anim);
        ButterKnife.bind(this);

        ini();
    }


    private void ini() {

        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        } else {

        }
    }
}
