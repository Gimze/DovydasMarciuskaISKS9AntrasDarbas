package com.example.dovydasmarciuskaisks9pirmasdarbas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
        TextView txt;
        EditText editText;
        button = (Button) findViewById(R.id.button);
        txt = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                String spinnerSelection = spinner.getSelectedItem().toString();
                int selection = (int) spinner.getSelectedItemId();
                if (selection==1) {
                    txt.setText("zodziu skaicius:" + String.valueOf(wordCount.CounterWords(editText.getText().toString())));
                }
                if(selection==0) {
                    txt.setText("simboliu skaicius:" + String.valueOf(charCount.CounterChars(editText.getText().toString())));
                }
                }

        });
    }
}

