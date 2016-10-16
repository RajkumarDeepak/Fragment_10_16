package com.example.android.fragment_10_16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements topSectionFragment.TopSectionListner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom) {
       BottomPictureFragmnent bottomPictureFragmnent =(BottomPictureFragmnent)getSupportFragmentManager().findFragmentById(R.id.fragment);
        bottomPictureFragmnent.setMemeText(top,bottom);
    }
}
