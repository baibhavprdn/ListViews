package com.example.baibhav.listviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.tag;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="mymessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"OnCreate");

        ListView listView=(ListView) findViewById(R.id.thelist);

        ArrayList<String> names= new ArrayList<>();
        names.add("Baibhav");
        names.add("Vivek");
        names.add("Radip");
        names.add("Samyak");
        names.add("Dipesh");


        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.simple_list_item_1,names);
        listView.setAdapter(adapter);
        Log.i(TAG,"adapter");

    }


}
