package com.example.joel.mysplashscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.EditText;

/**
 * Created by joel on 2/16/2018.
 */

public class LoginActivity extends AppCompatActivity {
    CardView loginButton;
    EditText editName;
    EditText editPass;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

    }
}
