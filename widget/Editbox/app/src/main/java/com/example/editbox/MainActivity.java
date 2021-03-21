package com.example.editbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
EditText editText;
Button button;
TextView scroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edittext1);
        button = (Button) findViewById(R.id.btn1);
        button.setOnClickListener(this);
        scroll=(TextView)findViewById(R.id.scroll);
        scroll.setSelected(true);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this,editText.getText(),Toast.LENGTH_SHORT).show();

    }
}
