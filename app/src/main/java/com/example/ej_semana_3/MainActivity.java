package com.example.ej_semana_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;

import com.example.ej_semana_3.adapters.MascotaRecyclerViewAdapter;
import com.example.ej_semana_3.entities.Mascota;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MascotaRecyclerViewAdapter adapter;
    RecyclerView rvMascotas;
    List<Mascota> mascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();
    }

    public void initializeView(){

        mascotas = new ArrayList<>();
        Bitmap image_b1 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.b1);
        mascotas.add(new Mascota("Pepe",image_b1,2));
        Bitmap image_b2 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.b2);
        mascotas.add(new Mascota("Rocky",image_b2,3));
        Bitmap image_b3 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.b3);
        mascotas.add(new Mascota("Bernarda",image_b3,4));
        Bitmap image_b4 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.b4);
        mascotas.add(new Mascota("Charlie",image_b4,5));


        rvMascotas = findViewById(R.id.rvMascotas);
        rvMascotas.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MascotaRecyclerViewAdapter(this, mascotas);
        rvMascotas.setAdapter(adapter);
    }
}