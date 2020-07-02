package com.example.fix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.fix.fitur.home.FragmentMasakan;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment;
        fragment = new FragmentMasakan("http://192.168.43.107/resep/tampilsemua.php/");
        getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,fragment,fragment.getClass().getSimpleName()).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void pop(MenuItem item) {
        Tentang myDialog = new Tentang();
        myDialog.show(getSupportFragmentManager(), "Dialog Fragment Example");
    }

    public void reseplain(MenuItem item) {
        String url = "https://www.google.com";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void privasi(MenuItem item) {
        String url = "https://udadev356.blogspot.com/2018/05/kebijakan-privasi-app-udadev.html?m=1";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}