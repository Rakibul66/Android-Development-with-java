package com.gstdio71.spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {



    // define spinner

    Spinner sp ;



    //DEFINE TEXT VIEW

    TextView display_data ;

    //make string Arrary

    String names[] = {"Chattogram","Dhaka","Cumilla","Dinajpur","Faridpur","jashore","Khulna","Mymensingh","Nator","Magura","Rajshahi","Rangpur"};

    //defins array adapter of string type

    ArrayAdapter <String> adapter;

    //define string variable for record

    String record= "";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner)findViewById(R.id.spinnerid);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        display_data = (TextView)findViewById(R.id.display_result);


        display_data.setOnClickListener(new View.OnClickListener() { // set onclick listener to my textview
            @Override
            public void onClick(View view) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(Context.CLIPBOARD_SERVICE);
                cm.setText(display_data.getText().toString());
                Toast.makeText(getApplicationContext(), "Copied :)", Toast.LENGTH_SHORT).show();
            }
        });
        //set adapter to spinner

        sp.setAdapter(adapter);

        //set spinner method

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //use postion value

                switch (position)

                {

                    case 0:

                        record = "Chittagong Medical College Hospital\n" +
                                "        Phone:0616891,0616892\n" +
                                "Railway Hospital,C R B\n" +
                                "Phone:031720121,031720122,031720123"+
                        "Fatema Begum Red Crescent Blood Center\n\nPhone:031620685";

                        break;

                    case 1:

                        record = " 31/v Shilpacharya Zainul Abedin Sarak,Shantinagar,Dhaka 1217\n" +
                                "        Phone:029351969\n\n" +
                                " 7/5,Aurangzeb Road,Mohammadpur,Dhaka\n" +
                                "        Phone:029116563,028121497,029139940"+"\n\nSandahni(Bangladesh Agriculture University Unit\n" +
                                "Shaymoli,Dhaka\nPhone:9155695\n\n"
                                +"\nSandahni(Sir Salimullah Medical college Unit\n" +
                                "Lalbg,Dhaka\nPhone:27319123\n" +
                                "\nRetina Blood Bank\n" +
                                "Nowab Habibullah Road,Dhaka\nPhone:029663853";

                        break;

                    case 2:

                        record = "Sandhani(Commila Medical College Unit\n" +
                                "Cumilla Sadar    Phone:6343001,6345001" ;

                        break;
                    case 3:

                        record = "Begum Tayeeba Mojumder Red Crescent Blood Center \n" +
                                "New Town    Phone:0531 64021"+
                        "Sandhani(Dinajpur Medical College Unit)\n" +
                                "Phone:5314787";

                        break;

                    case 4:

                        record = "Shandhani(Faridpur Medical College Unit \n" +
                                "Phone:6312743";

                        break;
                    case 5:

                        record = "Munshi Mehabullah Road,Jashore \n" +
                                "Phone:042168882 01939 109722";

                        break;

                    case 6:

                        record = "Sandhani(Khulna Medical College Unit \n" +
                                "Phone:41761509";

                        break;
                    case 7:

                        record = "Sandhani(Mymensingh Medical College Unit \n" +
                                "Phone:9154829";

                        break;
                    case 8:

                        record = "Nator Red Crescent Blood Center,Hospital Road \n" +
                                "Phone:0771 66961  ,01722777725";

                        break;
                    case 9:

                        record = "Achia Khatun Memorial Red Crescent Blood Center \n" +
                                "Phone:01753 088022,01914649885";

                        break;
                    case 10:

                        record = "Rajshahi Red Crescent Blood Center\n" +
                                "Phone:01797873957 ,01740384078";

                        break;
                    case 11:

                        record = "Sandhani(Rangpur Medical College Unit \n" +
                                "Phone:52165180";

                        break;

                }

            }

            @Override

            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }

    //set display button click to show result

    public void diplsyResult(View view)

    {

        display_data.setTextSize(18);

        display_data.setText(record);

    }

}