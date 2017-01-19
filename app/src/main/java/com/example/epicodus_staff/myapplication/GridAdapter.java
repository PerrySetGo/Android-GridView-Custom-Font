package com.example.epicodus_staff.myapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by epicodus_staff on 1/19/17.
 */

public class GridAdapter extends BaseAdapter {

    private Context context;
    private String[] letters;
    private Typeface font;

    public GridAdapter(Context context, String[] letters, Typeface font) {
        this.context = context;
        this.letters = letters;
        this.font = font;
    }

    @Override
    public int getCount() {
        return letters.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            // get layout from xml file
            gridView = inflater.inflate(R.layout.custom_grid_item, null);

            // set value into textview
            TextView textView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);

            //apply font passed in thru constructor
            textView.setTypeface(font);
            textView.setText(letters[position]);

        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }
}
