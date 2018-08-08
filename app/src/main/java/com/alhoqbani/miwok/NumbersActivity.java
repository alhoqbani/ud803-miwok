package com.alhoqbani.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 5: " + words.get(5));

        // Using while loop to add list of words to the rootView
        LinearLayout rootView = findViewById(R.id.rootView);
        int count = 0;
        while (count < words.size()) {
            TextView textView = new TextView(this);
            textView.setText(words.get(count));
            rootView.addView(textView);
            count++;
        }

    }
}
