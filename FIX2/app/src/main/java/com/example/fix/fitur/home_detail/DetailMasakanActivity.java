package com.example.fix.fitur.home_detail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.fix.R;
import com.example.fix.entity.Masakan;

public class DetailMasakanActivity extends AppCompatActivity {
    Masakan m;

    TextView textView,textView2,textView3,textView4;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_masakan);

        m = getIntent().getParcelableExtra("masakan");

        img = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        textView.setText(m.getNama());
        textView2.setText(m.getCara());
        textView3.setText(m.getPendahuluan());
        textView4.setText(m.getResep());

        Glide.with(getApplicationContext())
                .load(m.getFoto())
                .into(img);
    }
}