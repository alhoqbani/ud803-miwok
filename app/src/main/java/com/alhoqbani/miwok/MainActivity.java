package com.alhoqbani.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Open Activity Method 2: ClickListener class
        FamilyClickListener familyClickListener = new FamilyClickListener();
        TextView family = findViewById(R.id.family);
        family.setOnClickListener(familyClickListener);
    }

    /**
     * Open Activity Method 1: onClick xml attribute.
     * This will method will be called when 'Numbers' TextView is clicked.
     *
     * @param view The text view was clicked.
     */
    public void openNumbersActivity(View view) {
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }
}
