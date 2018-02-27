package com.example.joel.mysplashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editName;
    EditText editPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName =(EditText)findViewById(R.id.editName);
        editPass =(EditText)findViewById(R.id.editPass);
    }
    public void OnClick(View v){
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);

    }
}
