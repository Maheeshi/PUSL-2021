package com.example.signlang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PageOne extends AppCompatActivity implements View.OnClickListener {
    public CardView num1, num2,num3, num4,num5, num6,num7, num8,num9, num10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);

        num1 = (CardView) findViewById(R.id.v1);
        num2 = (CardView) findViewById(R.id.v2);
        num3 = (CardView) findViewById(R.id.v3);
        num4 = (CardView) findViewById(R.id.v4);
        num5 = (CardView) findViewById(R.id.v5);
        num6 = (CardView) findViewById(R.id.v6);
        num7 = (CardView) findViewById(R.id.v7);
        num8 = (CardView) findViewById(R.id.v8);
        num9 = (CardView) findViewById(R.id.v9);
        num10 = (CardView) findViewById(R.id.v10);

        num1.setOnClickListener((View.OnClickListener) this);
        num2.setOnClickListener((View.OnClickListener) this);
        num3.setOnClickListener((View.OnClickListener) this);
        num4.setOnClickListener((View.OnClickListener) this);
        num5.setOnClickListener((View.OnClickListener) this);
        num6.setOnClickListener((View.OnClickListener) this);
        num7.setOnClickListener((View.OnClickListener) this);
        num8.setOnClickListener((View.OnClickListener) this);
        num9.setOnClickListener((View.OnClickListener) this);
        num10.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        if (v.getId() == R.id.v1) {
            i = new Intent(this, DisOne.class);
            startActivity(i);
        } else if (v.getId() == R.id.v2) {
            i = new Intent(this, DisTwo.class);
            startActivity(i);
        } else if (v.getId() == R.id.v3) {
            i = new Intent(this, DisThree.class);
            startActivity(i);
        } else if (v.getId() == R.id.v4) {
            i = new Intent(this, DisFour.class);
            startActivity(i);
        } else if (v.getId() == R.id.v5) {
            i = new Intent(this, DisFive.class);
            startActivity(i);
        } else if (v.getId() == R.id.v6) {
            i = new Intent(this, DisSix.class);
            startActivity(i);
        } else if (v.getId() == R.id.v7) {
            i = new Intent(this, DisSeven.class);
            startActivity(i);
        } else if (v.getId() == R.id.v8) {
            i = new Intent(this, DisEight.class);
            startActivity(i);
        } else if (v.getId() == R.id.v9) {
            i = new Intent(this, DisNine.class);
            startActivity(i);
        } else if (v.getId() == R.id.v10) {
            i = new Intent(this, DisTen.class);
            startActivity(i);

        }
    }
}