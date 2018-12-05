package com.example.chris.tp1mobilecomputing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    private Button buttonValidate;
    private EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initViews();
    }

    private void initViews()
    {
        buttonValidate = findViewById(R.id.activity_form_button_validate);
        editTextName = findViewById(R.id.activity_form_edittext_name);
    }
}
