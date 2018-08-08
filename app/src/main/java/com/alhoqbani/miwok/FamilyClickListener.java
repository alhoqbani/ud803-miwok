package com.alhoqbani.miwok;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class FamilyClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        // The context is the MainActivity class.
        Context context = view.getContext();
        // Start new intent to open FamilyActivity
        Intent intent = new Intent(context, FamilyActivity.class);
        context.startActivity(intent);
    }
}
