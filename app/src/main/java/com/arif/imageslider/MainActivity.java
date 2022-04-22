package com.arif.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager duaImageId, nameImageId;
    ArrayList<Integer> images = new ArrayList<>();
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        duaImageId = findViewById(R.id.duaImageId);
        images.add(R.drawable.a);
        images.add(R.drawable.b);
        images.add(R.drawable.c);
        images.add(R.drawable.d);
        images.add(R.drawable.e);


        adapter = new ViewPagerAdapter(this,images);
        duaImageId.setPadding(0,0,100,0);
        duaImageId.setAdapter(adapter);

    }
}