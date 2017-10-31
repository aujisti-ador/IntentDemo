package com.ador.intentdemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView tv_name;
    ImageView iv_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tv_name = findViewById(R.id.tv_name);
        iv_image = findViewById(R.id.iv_image);


        String value = getIntent().getExtras().getString("place");

        switch (value)
        {
            case "dhaka":
                tv_name.setText("Dhaka");
                iv_image.setBackground(getResources().getDrawable(R.drawable.dhaka));
                break;
            case "chi":
                tv_name.setText("Chittagong");
                iv_image.setBackground(getResources().getDrawable(R.drawable.chittagong));
                break;
            case "raj":
                tv_name.setText("Rajshahi");
                iv_image.setBackground(getResources().getDrawable(R.drawable.rajshahi));
                break;
            case "khulna":
                tv_name.setText("Khulna");
                iv_image.setBackground(getResources().getDrawable(R.drawable.khulna));
                break;
            case "rangpur":
                tv_name.setText("Rangpur");
                iv_image.setBackground(getResources().getDrawable(R.drawable.rangpur));
                break;
            case "sylhet":
                tv_name.setText("Sylhet");
                iv_image.setBackground(getResources().getDrawable(R.drawable.sylhet));
                break;
            case "barishal":
                tv_name.setText("Barishal");
                iv_image.setBackground(getResources().getDrawable(R.drawable.barishal));
                break;
            case "mymensing":
                tv_name.setText("Mymensingh");
                iv_image.setBackground(getResources().getDrawable(R.drawable.mymensinsh));
                break;
        }
    }
}
