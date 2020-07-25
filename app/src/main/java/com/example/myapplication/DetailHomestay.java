package com.example.myapplication;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class DetailHomestay extends AppCompatActivity {
    ImageView imageView;
    TextView textTitle, textDetail2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_homestay);
        imageView = findViewById(R.id.image_detail);
        textDetail2 = findViewById(R.id.detail2);
        textTitle = findViewById(R.id.title_detail);
        getSupportActionBar().setTitle("Detail Home Stay");
        imageView.setImageResource(getIntent().getIntExtra("image", 0));
        textDetail2.setText(getIntent().getStringExtra("detail2"));
        textTitle.setText(getIntent().getStringExtra("title")); }}
