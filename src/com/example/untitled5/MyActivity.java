package com.example.untitled5;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ben);

        final EditText vol = (EditText) findViewById(R.id.etVol);
        final EditText perc = (EditText) findViewById(R.id.etPerc);
        final EditText pri = (EditText) findViewById(R.id.etPrice);
        final EditText quant = (EditText) findViewById(R.id.etQuantity);
        Button crunkOut = (Button) findViewById(R.id.bCalc);
        final Button nextDrink = (Button) findViewById(R.id.bNextDrink);
//        final TextView crunkView = (TextView) findViewById(R.id.tvCrunkOut);

        crunkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double volume = Integer.parseInt(vol.getText().toString());
                double percentage = Integer.parseInt(perc.getText().toString());
                double price = Integer.parseInt(pri.getText().toString());
                double quantity = Integer.parseInt(quant.getText().toString());

                double equat = (percentage/100)*volume/price;
                equat = (double) Math.round(equat * 100) / 100;


//                crunkView.setText(String.valueOf(equat) + "mL");
            }
        });

                nextDrink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nextDrink();
                    }
                });

    }

    void nextDrink(){
        LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = vi.inflate(R.layout.drinkform, null);

// insert into main view
        View insertPoint = findViewById(R.id.formView);
        ((ViewGroup) insertPoint).addView(v);
    }
        }
