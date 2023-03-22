package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.recyclerview.Adapter.itemAdapter;
import com.example.recyclerview.Model.itemList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    itemList[] mydata = new itemList[]{
            new itemList("Durian",R.drawable.durian),
            new itemList("Anggur",R.drawable.anggur),
            new itemList("Apel",R.drawable.apel),
            new itemList("kelapa",R.drawable.kelapa),
            new itemList("Belimbing",R.drawable.belimbing),
            new itemList("Pisang",R.drawable.pisang),
            new itemList("Salak",R.drawable.salak),
            new itemList("Semangka",R.drawable.semongko),
            new itemList("Pepaya",R.drawable.pepaya),
            new itemList("Khuldi",R.drawable.khuldi),
            new itemList("Jerus",R.drawable.jeruk),
            new itemList("Naga",R.drawable.naga),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        itemAdapter adapter = new itemAdapter(mydata);
        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager linear = new LinearLayoutManager(getApplicationContext());
        linear.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linear);

        recyclerView.setAdapter(adapter);
    }
}