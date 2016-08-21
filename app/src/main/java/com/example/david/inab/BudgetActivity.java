package com.example.david.inab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BudgetActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
    }

    /** Called when the user clicks the submit button */
    public void bookAmount(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText amountValue = (EditText) findViewById(R.id.amountValue);
        double amount =  Double.parseDouble(amountValue.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, amount);
        startActivity(intent);
    }
}
