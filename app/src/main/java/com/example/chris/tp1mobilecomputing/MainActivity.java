package com.example.chris.tp1mobilecomputing;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    RecyclerView recyclerView;
    Button buttonNext;
    NameViewListAdapter nameListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameListAdapter = new NameViewListAdapter();

        initViews();
        initList();
    }

    private void initViews()
    {
        buttonNext = findViewById(R.id.activity_main_button_next);
        recyclerView = findViewById(R.id.activity_main_recyclerview);

        buttonNext.setOnClickListener(this);
        //recyclerViewName.setText(R.string.activity_main_button_next);
    }

    private void initList()
    {
        final LinearLayoutManager linearLatLayoutManager = new LinearLayoutManager(this);

        linearLatLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLatLayoutManager);
        recyclerView.setAdapter(nameListAdapter);
    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.activity_main_button_next :
                Intent intent;
                intent = new Intent(this, FormActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        nameListAdapter.updateData(DataManager.getInstance().getName());
    }
}
