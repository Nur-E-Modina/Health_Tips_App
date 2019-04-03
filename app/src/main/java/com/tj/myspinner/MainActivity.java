package com.tj.myspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
String[] disease;
private Spinner spinner;
private TextView textView;
private Button button;
private Button button2;
    private Health_details expert = new Health_details();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        disease=getResources().getStringArray(R.array.Disease_names);
        spinner=(Spinner)findViewById(R.id.spinnerId);
        textView=(TextView)findViewById(R.id.textViewId);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.buttonId3);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.spinner,R.id.textView2Id,disease);
        spinner.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=spinner.getSelectedItem().toString();
                String diseaseType = String.valueOf(spinner.getSelectedItem());
//Get recommendations from the BeerExpert class
                List<String> diseaseList = expert.gettype(diseaseType);
                StringBuilder brandsFormatted = new StringBuilder();
                for (String type: diseaseList) {
                    brandsFormatted.append(type).append('\n');

                }
//Display the beers
                textView.setText(brandsFormatted);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Deatils.class);
                intent.putExtra("tag","Please click a button for details");

                startActivity(intent);

            }
        });
    }
}
