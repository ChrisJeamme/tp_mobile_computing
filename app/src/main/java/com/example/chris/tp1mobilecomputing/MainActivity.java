package com.example.chris.tp1mobilecomputing;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewName;
    Button buttonNext;
    static final private int FORM_RESULT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews()
    {
        textViewName = findViewById(R.id.activity_main_textview_name);
        buttonNext = findViewById(R.id.activity_main_button_next);

        textViewName.setText(R.string.activity_main_button_next);
        buttonNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.activity_main_button_next :
                Intent intent;
                intent = new Intent(this, FormActivity.class);
                startActivityForResult(intent, FORM_RESULT);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1)
        {
            if(resultCode == RESULT_OK && data.getExtras() != null)
            {
                Bundle args = data.getExtras();
                String username = args.getString("USERNAME");
                textViewName.setText(username);

            }
        }
    }
}
