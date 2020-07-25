package com.example.myapplication;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class DetailTempatWisata extends AppCompatActivity {
    ImageView imageView;
    TextView textTittle, textDetail2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tempat_wisata);
        getSupportActionBar().setTitle("Detail");
        imageView = findViewById(R.id.image_detail);
        textDetail2 = findViewById(R.id.detail2);
        textTittle = findViewById(R.id.tittle_detail);
        imageView.setImageResource(getIntent().getIntExtra("image", 0));
        textDetail2.setText(getIntent().getStringExtra("detail2"));
        textTittle.setText(getIntent().getStringExtra("tittle")); }}
