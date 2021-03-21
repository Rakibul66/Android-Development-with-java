package com.gstdio71.codeview;

public class Contant {
    public static  final String Activity="package com.gstdio71.codeview;\n" +
            "\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "import android.app.Activity;\n" +
            "import android.os.Bundle;\n" +
            "\n" +
            "import thereisnospon.codeview.CodeView;\n" +
            "import thereisnospon.codeview.CodeViewTheme;\n" +
            "import static com.gstdio71.codeview.Contant.Activity;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    CodeView codeView,codeview2;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        codeView=(CodeView)findViewById(R.id.codeview);\n" +
            "        \n" +
            "        codeview2=(CodeView)findViewById(R.id.codeview2);\n" +
            "        codeView.setTheme(CodeViewTheme.ANDROIDSTUDIO).fillColor();\n" +
            "        //CODE is your code which  you want to show,type is String\n" +
            "        codeView.showCode(Activity);\n" +
            "    }\n" +
            "}\n";
    public static  final String layout="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "    <ScrollView\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\">\n" +
            "        <LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:orientation=\"vertical\"\n" +
            "            android:layout_margin=\"5dp\"\n" +
            "            android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "<TextView\n" +
            "    android:layout_width=\"wrap_content\"\n" +
            "    android:textSize=\"23sp\"\n" +
            "    android:text=\"Main activity\"\n" +
            "    android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "</TextView>\n" +
            "\n" +
            "    <thereisnospon.codeview.CodeView\n" +
            "        android:id=\"@+id/codeview\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\">\n" +
            "    </thereisnospon.codeview.CodeView>\n" +
            "            <TextView\n" +
            "    android:layout_width=\"wrap_content\"\n" +
            "    android:textSize=\"23sp\"\n" +
            "    android:text=\"layout\"\n" +
            "    android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "</TextView>\n" +
            "\n" +
            "    <thereisnospon.codeview.CodeView\n" +
            "        android:id=\"@+id/codeview2\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\">\n" +
            "    </thereisnospon.codeview.CodeView>\n" +
            "        </LinearLayout>\n" +
            "    </ScrollView>\n" +
            "</RelativeLayout>";
}
