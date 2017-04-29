package com.tenpa_mf.bmicaluculation;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI_caluculation extends Activity {

    EditText Height_editText,Mass_editText;
    TextView textView6,textView,textView2,textView7;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_bmi_caluculation);

        Mass_editText = (EditText) findViewById(R.id.editText);
        Mass_editText.setTextColor(Color.BLACK);
        Mass_editText.setHint("体重(kg)");
        Height_editText =(EditText)findViewById(R.id.editText2);
        Height_editText.setTextColor(Color.BLACK);
        Height_editText.setHint("身長(m)");
        button = (Button)findViewById(R.id.button);
        button.setTextColor(Color.BLACK);
        textView = (TextView)findViewById(R.id.textView);
        textView.setTextColor(Color.BLACK);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setTextColor(Color.BLACK);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setTextColor(Color.BLACK);
        textView7=(TextView)findViewById(R.id.textView7);
        textView7.setTextColor(Color.BLACK);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                double height = Double.parseDouble(Height_editText.getText().toString());

                double mass = Double.parseDouble(Mass_editText.getText().toString());

                double BMI = mass/(height*height);
                String result_BMI = String.format("%.2f",BMI);

                textView6.setText("BMI="+result_BMI+"です！");
                textView6.setTextColor(Color.BLACK);
            }
        });
    }
}
