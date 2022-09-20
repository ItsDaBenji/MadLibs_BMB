package com.example.madlibs_bmb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FullStoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_story);

        Intent intent = getIntent();
        String[] messages = intent.getStringArrayExtra(MainActivity.EXTRA_MESSAGE);


        TextView[] textViews = new TextView[12];

        textViews[0] = findViewById(R.id.Output1);
        textViews[1] = findViewById(R.id.Output2);
        textViews[2] = findViewById(R.id.Output3);
        textViews[3] = findViewById(R.id.Output4);
        textViews[4] = findViewById(R.id.Output5);
        textViews[5] = findViewById(R.id.Output6);
        textViews[6] = findViewById(R.id.Output7);
        textViews[7] = findViewById(R.id.Output8);
        textViews[8] = findViewById(R.id.Output9);
        textViews[9] = findViewById(R.id.Output10);
        textViews[10] = findViewById(R.id.Output11);
        textViews[11] = findViewById(R.id.Output12);

        for(int i = 0; i < textViews.length; i++)
        {
            textViews[i].setText(messages[i]);
        }
    }
}