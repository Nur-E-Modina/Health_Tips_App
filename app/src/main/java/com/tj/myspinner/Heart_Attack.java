package com.tj.myspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Heart_Attack extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart__attack);
        textView=(TextView)findViewById(R.id.text3);
        Bundle bundle3=getIntent().getExtras();
        if(bundle3!=null){
            String value=bundle3.getString("HA");
            textView.setText(value);
        }
    }
}
