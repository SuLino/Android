package com.hfad.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
     private BeerExpert beerExpert=new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    }
    public void chooseDrink(View view){
        Spinner drinkType = findViewById(R.id.drink_type);
        TextView drink=findViewById(R.id.textview);
        String s = String.valueOf(drinkType.getSelectedItem());
        List<String> brands = beerExpert.getBrands(s);
        StringBuilder builder=new StringBuilder();
        for (String brand:brands) {
            builder.append(brand).append("\n");
        }
        drink.setText(builder);
    }
}