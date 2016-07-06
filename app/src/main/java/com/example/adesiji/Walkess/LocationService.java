package com.example.adesiji.Walkess;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LocationService extends AppointmentType {

    Button getlocation = null;
    Button disconnect = null;
    Button connect = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracking);


        getlocation = (Button)findViewById(R.id.getLocation);

        disconnect = (Button)findViewById(R.id.disconnect);

        connect = (Button)findViewById(R.id.connect);
    }

    public void getLocation (View view) {
        int id = view.getId();
        if (id == R.id.getLocation) {
            Intent intent = new Intent(view.getContext(), Track_Minutes_Walk.class);
            startActivity(intent);
        }
    }
    public void disconnect (View view) {
        int id = view.getId();
        if (id == R.id.getLocation) {
            Intent intent = new Intent(view.getContext(), Track_Minutes_Walk.class);
            startActivity(intent);
        }
    }
    public void connect (View view) {
        int id = view.getId();
        if (id == R.id.getLocation) {
            Intent intent = new Intent(view.getContext(), Track_Minutes_Walk.class);
            startActivity(intent);
        }
    }
}