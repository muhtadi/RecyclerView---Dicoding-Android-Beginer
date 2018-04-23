package com.example.muhtadi.recyclerviewpresident;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailPresident extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_president);

        TextView tvDetailRemarks = (TextView)findViewById(R.id.tv_detail_remarks);
        TextView tvDetailName = (TextView)findViewById(R.id.tv_detail_name);
        ImageView imageView = (ImageView)findViewById(R.id.img_detail_photo);

        tvDetailName.setText(getIntent().getStringExtra("name"));
        tvDetailRemarks.setText(getIntent().getStringExtra("remarks"));
        Glide.with(this).load(getIntent().getStringExtra("photo")).into(imageView);
    }
}
