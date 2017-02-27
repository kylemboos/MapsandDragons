package com.kyleboos.dungeonsanddragons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MapActivity extends AppCompatActivity {

    MapGridView mapGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mapGridView = new MapGridView(this);
        setContentView(mapGridView);
    }

    //USE RXJAVA to broadcast touch events for the View to observe/subscribe to.
}
