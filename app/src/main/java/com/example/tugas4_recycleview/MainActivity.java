package com.example.tugas4_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.os.Bundle;




public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private gameAdapter adapter;
    private ArrayList<game> gameArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =(RecyclerView)findViewById(R.id.recycleview);
        adapter = new gameAdapter(gameArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        gameArrayList = new ArrayList<>();
        gameArrayList.add(new game("Mobile legends", "1918051", "Sandi",R.drawable.ml));
        gameArrayList.add(new game("PUBG", "1998051", "Limpah",R.drawable.pubg));
        gameArrayList.add(new game("Dota 2", "1918051", "MIKEY",R.drawable.dota2));
        gameArrayList.add(new game("Valorant", "1918051", "Jetzz",R.drawable.val));
    }
    }
