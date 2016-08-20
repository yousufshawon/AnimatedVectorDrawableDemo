package com.shawon.yousuf.vectordrawabledemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.shawon.yousuf.vectordrawabledemo.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.buttonHeart)
    Button buttonHeart;
    @Bind(R.id.buttonChip)
    Button buttonChip;
    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ini();
    }


    private void ini() {

    }


    private void startActivity(Class<? extends Activity> mStartActivityClass) {

        Intent intent = new Intent(this, mStartActivityClass);
        startActivity(intent);
    }

    @OnClick({R.id.buttonHeart, R.id.buttonChip})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonHeart:
                startActivity(ActivityHeartAnim.class);
                break;
            case R.id.buttonChip:
                startActivity(ActivityChipAnim.class);
                break;
        }
    }
}
