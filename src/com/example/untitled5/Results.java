package com.example.untitled5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by portodin on 3/5/2014.
 */
public class Results extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        TextView crunkCoefficient = (TextView) findViewById(R.id.tvCC);



        Intent mIntent = getIntent();
        double result = mIntent.getDoubleExtra("equatKey", 0);


        Log.e("hi", "this is " + result);

        String resultString = Double.toString(result);
        crunkCoefficient.setText(resultString + "mL of alcohol per $1." );

    }
}

// TODO: Show values for every form created, and then compare each, using meters/stars/numbers, ect.