package com.example.dovydasmarciuskaisks9pirmasdarbas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
        Button button2;
        TextView txt;
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        txt = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                txt.setText("Dovydas Marciuska");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                txt.setTextColor(Color.parseColor("#00ff15"));

            }
        });




    }
}