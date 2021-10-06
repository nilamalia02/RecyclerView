package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.nila;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //inisialisasi : RecycleView, Adapter(nilaAdapter), ArrayList(nilaArrayList);
    private RecyclerView recyclerView;
    private nilaAdapter NilaAdapter;
    private ArrayList<nila> nilalArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil fungsi untuk menambahkan data ke dalam  list
        addData();
        //Mengakses recycler view di activity main
        recyclerView = findViewById(R.id.recyler_view);
        //memanggil adapter
        NilaAdapter = new nilaAdapter (nilalArrayList);
        //mengatur nilai recycler view dengan data adapter
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(NilaAdapter);

    }
    // fungsi untuk menambah data pada array list
    private void addData(){
        // inisialisasi list nila
        nilalArrayList = new ArrayList<>();
        //menambah data pada list
        nilalArrayList.add(new nila ("E41200368", "Nila Amalia", "Golongan : A", "Angkatan : 2020", "TTL : Banyuwangi, 16 Desember 2002", "Kelamin : Perempuan", "Email : nilaa3794@gmail.com" ,R.drawable.tif));
        nilalArrayList.add(new nila ("E41200368", "Nila Amalia", "Golongan : A", "Angkatan : 2020", "TTL : Banyuwangi, 16 Desember 2002", "Kelamin : Perempuan", "Email : nilaa3794@gmail.com" ,R.drawable.tif));
        nilalArrayList.add(new nila ("E41200368", "Nila Amalia", "Golongan : A", "Angkatan : 2020", "TTL : Banyuwangi, 16 Desember 2002", "Kelamin : Perempuan", "Email : nilaa3794@gmail.com" ,R.drawable.tif));
        nilalArrayList.add(new nila ("E41200368", "Nila Amalia", "Golongan : A", "Angkatan : 2020", "TTL : Banyuwangi, 16 Desember 2002", "Kelamin : Perempuan", "Email : nilaa3794@gmail.com" ,R.drawable.tif));
        nilalArrayList.add(new nila ("E41200368", "Nila Amalia", "Golongan : A", "Angkatan : 2020", "TTL : Banyuwangi, 16 Desember 2002", "Kelamin : Perempuan", "Email : nilaa3794@gmail.com" ,R.drawable.tif));
        nilalArrayList.add(new nila ("E41200368", "Nila Amalia", "Golongan : A", "Angkatan : 2020", "TTL : Banyuwangi, 16 Desember 2002", "Kelamin : Perempuan", "Email : nilaa3794@gmail.com" ,R.drawable.tif));
        nilalArrayList.add(new nila ("E41200368", "Nila Amalia", "Golongan : A", "Angkatan : 2020", "TTL : Banyuwangi, 16 Desember 2002", "Kelamin : Perempuan", "Email : nilaa3794@gmail.com" ,R.drawable.tif));
        nilalArrayList.add(new nila ("E41200368", "Nila Amalia", "Golongan : A", "Angkatan : 2020", "TTL : Banyuwangi, 16 Desember 2002", "Kelamin : Perempuan", "Email : nilaa3794@gmail.com" ,R.drawable.tif));


    }

}