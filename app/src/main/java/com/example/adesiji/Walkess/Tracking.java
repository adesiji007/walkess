package com.example.adesiji.Walkess;
import android.app.Activity;
import android.content.Intent;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.TextView;

import java.util.List;
import android.hardware.Sensor;
import android.hardware.SensorManager;

public class Tracking extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracking);



    }


    public void getLocation(View view) {
        int id = view.getId();

        if (id == R.id.getLocation) {
            Intent intent = new Intent(view.getContext(), MapsActivity.class);
            startActivity(intent);
        }
    }
    public void disconnect(View view) {
        int id = view.getId();

        if (id == R.id.disconnect) {
            Intent intent = new Intent(view.getContext(), MapsActivity.class);
            startActivity(intent);
        }
    }
    public void connect(View view) {
        int id = view.getId();

        if (id == R.id.connect) {
            Intent intent = new Intent(view.getContext(), MapsActivity.class);
            startActivity(intent);
        }
    }
}