package com.alhoqbani.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        // Using GridView to display list of words.
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
