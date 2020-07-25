package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
public class login extends AppCompatActivity {
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        getSupportActionBar().setTitle("Login"); }
    public void onSignup(View view) {
        Intent gotodaftar = new Intent(this, daftar.class);
        startActivity(gotodaftar); }
    public void gotomenu(View view) {
        String user = username.getText().toString();
        String pass = username.getText().toString();
        if (user.equals("admin") && pass.equals("admin")) {
            Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(login.this, MainActivity.class);
            login.this.startActivity(intent);
            finish();
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
            builder.setMessage("Username Atau Password Anda Salah!")
                    .setNegativeButton("Coba Lagi", null).create().show(); } }}
