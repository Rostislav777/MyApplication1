package com.example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView coffeeQuantity;
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coffeeQuantity = (TextView) findViewById(R.id.coffeeQuantity);

    }

    public void increment (View view){
        quantity ++;
        coffeeQuantity.setText("" + quantity);
    }


    public void decrement (View view){
        quantity --;
        coffeeQuantity.setText("" + quantity);
    }

}
