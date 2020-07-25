package com.example.myapplication;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class pwisata extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pwisata);
        getSupportActionBar().setTitle("Paket Wisata");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapterwisata adapter = new adapterwisata(setDataList());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter); }
    public datawisata[] setDataList(){
        datawisata [] myListData = new datawisata[] {
                new datawisata( R.drawable.paket1, "Paket Prambanan", "Detail", "Fasilitas:\n"+"Mobil\n"+
                        "Driver\n"+
                        "Tiket Wisata\n"+
                        "Parkir\n"+
                        "Sarapan\n"+
                        "Harga: Rp 150.000"),
                new datawisata( R.drawable.paket2, "Paket Tebing Breksi", "Detail", "Fasilitas:\n"+
                        "Tiket Wisata\n"+
                        "Parkir\n"+
                        "Sarapan\n"+
                        "Harga: Rp 100.000"),
                new datawisata( R.drawable.paket3, "Paket Candi Ratu Boko", "Detail", "Fasilitas:\n"+"Mobil\n"+
                        "Tiket Wisata\n"+
                        "Parkir\n"+
                        "Sarapan\n"+
                        "Harga: Rp 120.000"),
                new datawisata( R.drawable.paket4, "Paket Candi Ijo", "Detail", "Fasilitas:\n"+"Mobil\n"+
                        "Driver\n"+
                        "Tiket Wisata\n"+
                        "Parkir\n"+
                        "Sarapan\n"+
                        "Harga: Rp 150.000"),};
        return myListData; }}
