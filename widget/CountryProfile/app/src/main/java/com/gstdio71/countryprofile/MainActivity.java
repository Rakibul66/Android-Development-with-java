package com.gstdio71.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button bdbutton,indbutton,pakbutton;
 private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bdbutton=findViewById(R.id.bdid);
        indbutton=findViewById(R.id.indiaid);
        pakbutton=findViewById(R.id.pakid);

        bdbutton.setOnClickListener(this);

        indbutton.setOnClickListener(this);
        pakbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.bdid){
            intent=new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);}

            if(v.getId()==R.id.indiaid){
                intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("name","India");
                startActivity(intent);}
                if(v.getId()==R.id.pakid){
                    intent=new Intent(MainActivity.this,ProfileActivity.class);
                    intent.putExtra("name","pakistan");
                    startActivity(intent);
        }
    }
}
