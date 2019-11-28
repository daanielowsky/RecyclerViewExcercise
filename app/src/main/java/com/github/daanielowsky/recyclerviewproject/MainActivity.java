package com.github.daanielowsky.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<ExampleItem> exampleItems = new ArrayList<>();
        exampleItems.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sun, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sound, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sun, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sound, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sun, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sound, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sun, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sound, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sun, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sound, "Line 5", "Line 6"));
        exampleItems.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sun, "Line 3", "Line 4"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sound, "Line 5", "Line 6"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleItems);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
