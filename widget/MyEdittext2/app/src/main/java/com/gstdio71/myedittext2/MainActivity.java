package com.gstdio71.myedittext2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.edit_text1);
        EditText editText2 = findViewById(R.id.edit_text2);
        editText1.setOnEditorActionListener(editorListener);
        editText2.setOnEditorActionListener(editorListener);
    }

    private TextView.OnEditorActionListener editorListener = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            switch (actionId) {
                case EditorInfo.IME_ACTION_NEXT:
                    Toast.makeText(MainActivity.this, "Next", Toast.LENGTH_SHORT).show();
                    break;
                case EditorInfo.IME_ACTION_SEND:
                    Toast.makeText(MainActivity.this, "Send", Toast.LENGTH_SHORT).show();
                    break;
            }
            return false;
        }
    };
}
