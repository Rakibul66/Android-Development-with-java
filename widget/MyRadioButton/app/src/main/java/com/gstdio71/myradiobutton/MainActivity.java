package com.gstdio71.myradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private RadioGroup radioGroup;
private Button button;
private RadioButton Buttonitem;
private TextView resultTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radiogroup);
        button=findViewById(R.id.showbuttonid);
        resultTextview=findViewById(R.id.resultid);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             int selectedid=  radioGroup.getCheckedRadioButtonId();
             Buttonitem=findViewById(selectedid);
             String value=Buttonitem.getText().toString();
             resultTextview.setText("You have selected"+value);

           }
       });
    }
}
