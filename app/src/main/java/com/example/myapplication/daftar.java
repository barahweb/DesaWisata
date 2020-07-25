package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class daftar extends AppCompatActivity {
    EditText username, email, password;
    String hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        getSupportActionBar().setTitle("Daftar");
    }
    public void onSignIn(View view) {
        Intent gotologin = new Intent(this, login.class);
        startActivity(gotologin);
    }
    public void ondaftar(View view) {
        String user, mail, pass;
        user = username.getText().toString();
        mail = email.getText().toString();
        pass = password.getText().toString();
        Toast.makeText(view.getContext(), "Berhasil Daftar"+"\n"+"Username : "+ user + "\n" +"Email : " + mail +"\n" +"Password : " + pass, Toast.LENGTH_SHORT).show();
        Intent gotodaftar = new Intent(this, login.class);
        startActivity(gotodaftar); }}
