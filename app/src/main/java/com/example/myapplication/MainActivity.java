package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView menu_bawah;
    EditText username, email, password;
    String hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menunavigasi);
        getSupportActionBar().setTitle("Beranda"); // Memasang Judul pada Toolbar
        loadFragment(new HomeFragment());
        menu_bawah = findViewById(R.id.menu_bawah);
        menu_bawah.setOnNavigationItemSelectedListener(this);
    }
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
    public void aboutus(View view) {
        Intent intent = new Intent(MainActivity.this, AboutUs.class);
        startActivity(intent);
    }
    public void paketwisata(View view) {
        Intent intent = new Intent(MainActivity.this, pwisata.class);
        startActivity(intent);
    }
    public void homestay(View view) {
        Intent intent = new Intent(MainActivity.this, homestay.class);
        startActivity(intent);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.home:
                getSupportActionBar().setTitle("Beranda");
                fragment = new HomeFragment();
                break;
            case R.id.transaksi:
                break;
            case R.id.history:
                break;
            case R.id.profile:
                getSupportActionBar().setTitle("Profile");
                fragment = new ProfileFragment();
                break; }
        return loadFragment(fragment); }
    public void Keluar(View view) {
        Intent intent = new Intent(MainActivity.this, login.class);
        startActivity(intent); }
    public void tempatwisata(View view) {
        Intent intent = new Intent(MainActivity.this, TempatWisata.class);
        startActivity(intent); }}