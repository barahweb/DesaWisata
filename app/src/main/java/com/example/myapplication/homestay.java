package com.example.myapplication;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class homestay extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homestay);
        getSupportActionBar().setTitle("Home Stay");
    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    adapterhomestay adapter = new adapterhomestay(setDataList());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter); }
    public datahomestay[] setDataList(){
        datahomestay [] myListData = new datahomestay[] {
                new datahomestay( R.drawable.home1, "Maqmil Homestay Prambanan", "Detail",
                        "Fasilitas:\n"+"-Wifi\n" + "-2 Kamar Mandi\n" +
                        "-2 AC\n" +
                        "-Kolam renang\n" +
                        "-2 Kamar Tidur\n" +
                        "-Sarapan gratis\n" +
                        "Harga: Rp. 150.000"),
                new datahomestay( R.drawable.home2, "Henny Homestay Prambanan", "Detail", "Fasilitas:\n"+ "-1 Kamar Mandi\n" +
                        "-1 AC\n"+
                        "-1 Kamar Tidur\n" +
                        "-Sarapan gratis\n" +
                        "Harga: Rp. 130.000"),
                new datahomestay( R.drawable.home3, "Rumah Desa Homestay", "Detail", "Fasilitas:\n"+"-Wifi\n" + "-2 Kamar Mandi\n" +
                        "-2 AC\n" +
                        "-2 Kamar Tidur\n" +
                        "-Sarapan gratis\n" +
                        "Harga: Rp. 140.000"),
                new datahomestay( R.drawable.home4, "Hotel Prambanan Indah", "Detail", "Fasilitas:\n"+"-Wifi\n" + "-2 Kamar Mandi\n" +
                        "-2 AC\n" +
                        "-2 Kipas Angin\n" +
                        "-Kolam renang\n" +
                        "-4 Kamar Tidur\n" +
                        "-Sarapan gratis\n" +
                        "Harga: Rp. 180.000"),};
        return myListData; }}
