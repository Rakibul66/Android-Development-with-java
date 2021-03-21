package com.gstdio71.codeview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;
import static com.gstdio71.codeview.Contant.Activity;
import static com.gstdio71.codeview.Contant.layout;

public class MainActivity extends AppCompatActivity {
    CodeView codeView,codeView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        codeView=findViewById(R.id.codeview);

        codeView2=findViewById(R.id.codeview2);
        codeView.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        codeView.showCode(Activity);

        codeView2.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();
        //CODE is your code which  you want to show,type is String
        codeView2.showCode(layout);
    }
}
