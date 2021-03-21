package com.example.myrec;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Person objects
        Person john = new Person("John","01315861003","A+");
        Person steve = new Person("Steve","01315861003","B+");
        Person stacy = new Person("Stacy","01315861003","B-");
        Person ashley = new Person("Ashley","01315861003","A-");
        Person matt = new Person("Matt","01315861003","A-");
        Person matt2 = new Person("Matt2","01315861003","O+");
        Person matt3 = new Person("Matt3","01315861003","O-");
        Person matt4 = new Person("Matt4","01315861003","B+");
        Person matt5 = new Person("Matt5","01315861003","A+");
        Person matt6 = new Person("Matt6","01315861003","A+");
        Person matt7 = new Person("Matt7","01315861003","A-");
        Person matt8 = new Person("Matt8","01315861003","A-");
        Person matt9 = new Person("Matt9","01315861003","B-");
        Person matt10 = new Person("Matt10","01315861003","A-");
        Person matt11 = new Person("Matt11","01315861003","B-");

        Person roxy = new Person("roxy","01315861003","A+");
        Person tushar = new Person("tushar","01315861003","B+");
        Person maheen= new Person("maheen","01315861003","B-");
        Person lincon= new Person("lincon","01315861003","A-");
        Person kayes = new Person("kayes","01315861003","A-");
        Person abir= new Person("abir","01315861003","O+");
        Person akid= new Person("akid","01315861003","O-");
        Person saju = new Person("saju","01315861003","B+");


        //Add the Person objects to an ArrayList
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(john);
        peopleList.add(steve);
        peopleList.add(stacy);
        peopleList.add(ashley);
        peopleList.add(matt);
        peopleList.add(matt2);
        peopleList.add(matt3);
        peopleList.add(matt4);
        peopleList.add(matt5);
        peopleList.add(matt6);
        peopleList.add(matt7);
        peopleList.add(matt8);
        peopleList.add(matt9);
        peopleList.add(matt10);
        peopleList.add(matt11);
        peopleList.add(roxy);
        peopleList.add(tushar);
        peopleList.add(maheen);
        peopleList.add(lincon);
        peopleList.add(kayes);
        peopleList.add(abir);
        peopleList.add(akid);
        peopleList.add(saju);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }
}
