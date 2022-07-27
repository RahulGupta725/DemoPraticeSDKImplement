package com.example.demopraticesdkimplement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.praticesdk.Maths;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log.e("Rahul",""+ Maths.appIntegers(10,20,30));

        //Maths.appIntegers(10,20,30);

        Log.e("Rahul1",""+ Maths.add(5,6,2));
        Log.e("Rahul2",""+ Maths.subtract(5,6));
        Log.e("Rahul3",""+ Maths.multiply(5,6));
        Log.e("Rahul4",""+ Maths.doDiv(6,3));
        Log.e("Rahul5",""+ Maths.doMod(6,3));
        Log.e("Rahul6",""+ Maths.doPow(5,2));
    }
}