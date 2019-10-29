package com.example.silsilahkeluarga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKeluarga;
    private ArrayList<Keluarga> list = new ArrayList<>();
    private String title = "Silsilah Keluarga Sujud";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvKeluarga = findViewById(R.id.rv_heroes);
        rvKeluarga.setHasFixedSize(true);

        list.addAll(KeluargaData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKeluarga.setLayoutManager(new LinearLayoutManager(this));
        KeluargaAdapter keluargaAdapter = new KeluargaAdapter(list);
        rvKeluarga.setAdapter(keluargaAdapter);
    }

    private void setActionBarTitle(String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }
}
