package com.example.untitled5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    double volume;
    double percentage;
    double price;
    double quantity;
    int countTest = 1;
    int numOfButtons = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ben);

        final LinearLayout formContainer = (LinearLayout) findViewById(R.id.formContainer);
        View view = getLayoutInflater().inflate(R.layout.drinkform, formContainer,false);

        final LinearLayout drinkSelectionContainer = (LinearLayout) findViewById(R.id.drinkSelectContainer);
        final View view2 = getLayoutInflater().inflate(R.layout.main, drinkSelectionContainer,false);

        Button newDrink = new Button(this);
        newDrink.setText("test");
        newDrink.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        drinkSelectionContainer.addView(newDrink);
        formContainer.addView(view);


        final EditText vol = (EditText) findViewById(R.id.etVol);
        final EditText perc = (EditText) findViewById(R.id.etPerc);
        final EditText pri = (EditText) findViewById(R.id.etPrice);
        final EditText quant = (EditText) findViewById(R.id.etQuantity);
        final Button nextDrink = (Button) findViewById(R.id.bNextDrink);
              Button crunkOut = (Button) findViewById(R.id.bCalc);





            vol.setText("750");
            perc.setText("40");
            pri.setText("32");
            quant.setText("1");




        crunkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    //TODO: calculate crunk values for all forms

                volume = Integer.parseInt(vol.getText().toString());
                percentage = Integer.parseInt(perc.getText().toString());
                price = Integer.parseInt(pri.getText().toString());
                quantity = Integer.parseInt(quant.getText().toString());

                double equat = (percentage/100)*volume/price;
                equat = (double) Math.round(equat * 100) / 100;

                Log.e("MyActivity: ", "this is " + equat);


                Intent myIntent = new Intent(MyActivity.this, Results.class);
                myIntent.putExtra("equatKey", equat);
                startActivity(myIntent);


            }
        });

                nextDrink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        if (numOfButtons > 50){

                        }

                        Button newDrink[] = new Button[numOfButtons];
                        newDrink[numOfButtons] = new Button(getBaseContext());
                        newDrink[numOfButtons].setText("test" + countTest);
                        newDrink[numOfButtons].setLayoutParams(new LinearLayout.LayoutParams(
                                ViewGroup.LayoutParams.WRAP_CONTENT,
                                ViewGroup.LayoutParams.WRAP_CONTENT));

                        drinkSelectionContainer.addView(newDrink[numOfButtons]);

                        numOfButtons++;


                        // TODO: create buttons dynamically
                            //TODO: save form values, clear edit texts, and create new variables for edittexts.    

                 }

        });

    }




}
