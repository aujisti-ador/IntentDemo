package com.ador.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button dhaka,chi,raj,khulna,rong,syl,barishal,mymen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dhaka= (Button) findViewById(R.id.dhaka);
        chi= (Button) findViewById(R.id.chi);
        raj= (Button) findViewById(R.id.raj);
        khulna= (Button) findViewById(R.id.khulna);
        rong= (Button) findViewById(R.id.rang);
        syl= (Button) findViewById(R.id.sylhet);
        barishal= (Button) findViewById(R.id.bar);
        mymen= (Button) findViewById(R.id.mymen);

        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(MainActivity.this, DetailsActivity.class);
                newActivity.putExtra("place", "dhaka");
                startActivity(newActivity);

            }
        });
        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(MainActivity.this, DetailsActivity.class);
                newActivity.putExtra("place", "chi");
                startActivity(newActivity);

            }
        });
        raj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(MainActivity.this, DetailsActivity.class);
                newActivity.putExtra("place", "raj");
                startActivity(newActivity);

            }
        });
        khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(MainActivity.this, DetailsActivity.class);
                newActivity.putExtra("place", "khulna");
                startActivity(newActivity);

            }
        });
        rong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(MainActivity.this, DetailsActivity.class);
                newActivity.putExtra("place", "rangpur");
                startActivity(newActivity);

            }
        });
        syl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(MainActivity.this, DetailsActivity.class);
                newActivity.putExtra("place", "sylhet");
                startActivity(newActivity);

            }
        });
        barishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(MainActivity.this, DetailsActivity.class);
                newActivity.putExtra("place", "barishal");
                startActivity(newActivity);

            }
        });
        mymen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(MainActivity.this, DetailsActivity.class);
                newActivity.putExtra("place", "mymensing");
                startActivity(newActivity);

            }
        });
    }
}
