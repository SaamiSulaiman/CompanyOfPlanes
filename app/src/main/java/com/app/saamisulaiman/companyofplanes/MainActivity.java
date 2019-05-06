package com.app.saamisulaiman.companyofplanes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boeing , airbus , sukhoi , embraer , bombardier , fokker , atr ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void boeing(View view){
        Intent intent = new Intent(MainActivity.this, boeing.class);
        startActivity(intent);
    }

    public void airbus(View view){
        Intent intent = new Intent(MainActivity.this, airbus.class);
        startActivity(intent);
    }

    public void sukhoi(View view){
        Intent intent = new Intent(MainActivity.this, sukhoi.class);
        startActivity(intent);
    }

    public void embraer(View view){
        Intent intent = new Intent(MainActivity.this, embraer.class);
        startActivity(intent);
    }

    public void bombardier(View view){
        Intent intent = new Intent(MainActivity.this, bombardier.class);
        startActivity(intent);
    }

    public void fokker(View view){
        Intent intent = new Intent(MainActivity.this, fokker.class);
        startActivity(intent);
    }

    public void atr(View view){
        Intent intent = new Intent(MainActivity.this, atr.class);
        startActivity(intent);
    }

}
