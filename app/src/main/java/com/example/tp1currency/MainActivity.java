package com.example.tp1currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number;
    RadioGroup group;
    TextView afficher;
    Button btn;

    String selectedElement = "" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number = (EditText) findViewById(R.id.editTextNumber);
        group = (RadioGroup) findViewById(R.id.group);
        afficher = (TextView) findViewById(R.id.textView2);
        btn = (Button) findViewById(R.id.button);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int i){
                RadioButton radioButton = findViewById(i);
                if(radioButton != null){
                    selectedElement = radioButton.getText().toString();
                }

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!number.getText().toString().isEmpty()){
                    double result = Double.parseDouble(number.getText().toString());


                    if( selectedElement.equals("Euro To Dinar")){

                        afficher.setText(" "+(result * 0.3));

                    }else {
                        afficher.setText(" "+(result * 3.3));
                    }

                }else{
                    afficher.setText("Invalid !");

                }

            }
        });


    }
}