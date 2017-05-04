package com.dingyong.scroeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private ScoreView mScoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreView = (ScoreView) findViewById(R.id.sportView);

    }

    public void onStartNumber(View view) {
        EditText editText = (EditText) findViewById(R.id.edit);
        String text = editText.getText().toString();
        if (!TextUtils.isEmpty(text)) {
            mScoreView.setNumber(Integer.valueOf(text));
        }

    }
}
