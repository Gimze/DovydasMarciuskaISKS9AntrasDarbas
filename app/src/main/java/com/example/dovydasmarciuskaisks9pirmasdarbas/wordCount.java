package com.example.dovydasmarciuskaisks9pirmasdarbas;

import android.widget.EditText;

public class wordCount {
    public static int CounterWords(String TextBox) {
        String input = TextBox.toString().trim().replaceAll(",", " ").replace(".", " ");
        String[] wordCount = input.split("\\s");
        return wordCount.length;
    }
}