package com.example.epicodus_staff.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    static final String[] letters = new String[] {
            "A", "B", "C", "D", "E",
            "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O",
            "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface typeWriterFont = Typeface.createFromAsset(getAssets(), "atwriter.ttf");
        gridView = (GridView) findViewById(R.id.baseGridView);

        gridView.setAdapter(new GridAdapter(this, letters, typeWriterFont));

    }

}
