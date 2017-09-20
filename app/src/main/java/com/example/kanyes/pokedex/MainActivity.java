package com.example.kanyes.pokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public Button category_switch;
    public android.widget.SearchView search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        category_switch = (Button) findViewById(R.id.category_switch);
        search = (android.widget.SearchView) findViewById(R.id.search);

        category_switch.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.category_switch){
            Intent change_to_category = new Intent (getApplicationContext(), CategorySearch.class);
            startActivity(change_to_category);
        }
    }
}