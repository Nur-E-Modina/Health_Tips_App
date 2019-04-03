package com.tj.myspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class High_Blood_pressure extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high__blood_pressure);
        textView=(TextView)findViewById(R.id.text1);
        Bundle bundle1=getIntent().getExtras();
        if(bundle1!=null)
        {
            String value=bundle1.getString("BP");
            textView.setText(value);
        }
    }
}
