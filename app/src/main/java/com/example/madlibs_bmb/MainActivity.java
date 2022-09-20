package com.example.madlibs_bmb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "Hi";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToStory(View view) {
        Intent intent = new Intent(this, FullStoryActivity.class);
        EditText[] editTexts = new EditText[12];
        editTexts[0] = findViewById(R.id.UserInput1);
        editTexts[1] = findViewById(R.id.UserInput2);
        editTexts[2] = findViewById(R.id.UserInput3);
        editTexts[3] = findViewById(R.id.UserInput4);
        editTexts[4] = findViewById(R.id.UserInput5);
        editTexts[5] = findViewById(R.id.UserInput6);
        editTexts[6] = findViewById(R.id.UserInput7);
        editTexts[7] = findViewById(R.id.UserInput8);
        editTexts[8] = findViewById(R.id.UserInput9);
        editTexts[9] = findViewById(R.id.UserInput10);
        editTexts[10] = findViewById(R.id.UserInput11);
        editTexts[11] = findViewById(R.id.UserInput12);
        String[] messages = new String[12];
        for(int i = 0; i < messages.length; i++)
        {
            messages[i] = editTexts[i].getText().toString();
        }
        intent.putExtra(EXTRA_MESSAGE, messages);
        startActivity(intent);
    }

}