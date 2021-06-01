package com.mirea.grachev.resultactivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity {
    private EditText universityEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        universityEditText = findViewById(R.id.editUniversity);
    }

    public void onClickSendUniversity(View v){
        Intent intent = new Intent();
        intent.putExtra("University", universityEditText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}