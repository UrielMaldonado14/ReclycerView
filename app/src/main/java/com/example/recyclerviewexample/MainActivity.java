package com.example.recyclerviewexample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", R.drawable.image3));
        itemList.add(new Item("Item 4", R.drawable.image4));

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(itemList);
        recyclerView.setAdapter(adapter);
   }
}
