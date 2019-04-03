package com.tj.myspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class High_cholesterol extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_cholesterol);
        textView=(TextView)findViewById(R.id.text2);
        Bundle bundle2=getIntent().getExtras();
        if(bundle2!=null)
        {
            String value=bundle2.getString("HC");
            textView.setText(value);
        }

    }
}
