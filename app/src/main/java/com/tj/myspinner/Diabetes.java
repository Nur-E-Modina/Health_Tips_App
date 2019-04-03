package com.tj.myspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Diabetes extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes);
        textView=(TextView)findViewById(R.id.text4);
        Bundle bundle4=getIntent().getExtras();
        if(bundle4!=null)
        {
String value=bundle4.getString("DIA");
textView.setText(value);
        }
    }
}
