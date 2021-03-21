package com.gstdio71.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
  private ImageView imageView;
  private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageView=findViewById(R.id.img1);
        textView=findViewById(R.id.tx1);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String countryName=bundle.getString("name");
            showDetails(countryName);
        }
    }
    void showDetails(String countryNAme){
        if(countryNAme.equals("Bangladesh")){
            imageView.setImageResource(R.drawable.coronavirus);
            textView.setText(R.string.bd_text2);
        }
        if(countryNAme.equals("India")){
            imageView.setImageResource(R.drawable.cough);
            textView.setText(R.string.india_text);
        }if(countryNAme.equals("pakistan")){
            imageView.setImageResource(R.drawable.coronavirus);
            textView.setText(R.string.pak_text);
        }
    }
}
