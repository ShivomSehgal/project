package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.project.data.PrepTime;

public class MainActivity2 extends AppCompatActivity {

    public static int timeSelectedForPreparation;

    private Spinner mTaskSpinner;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, HomeScreen.class));
            }
        });

        mTaskSpinner = (Spinner) findViewById(R.id.spinnerTime);

        setupSpinner();
    }

    private void setupSpinner() {
        // Create adapter for spinner. The list options are from the String array it will use
        // the spinner will use the default layout
        ArrayAdapter SpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.array_time_options, android.R.layout.simple_spinner_item);

        // Specify dropdown layout style - simple list view with 1 item per line
        SpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        // Apply the adapter to the spinner
        mTaskSpinner.setAdapter(SpinnerAdapter);

        // Set the integer mSelected to the constant values
        mTaskSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection = (String) parent.getItemAtPosition(position);
                if (!TextUtils.isEmpty(selection)) {
                    if (selection.equals(getString(R.string.threeHours))) {
                        timeSelectedForPreparation = 3*3600;
                    } else if (selection.equals(getString(R.string.task_complete))) {
                        timeSelectedForPreparation = 5*3600;
                    } else {
                        timeSelectedForPreparation = 7*3600;
                    }
                }
            }

            // Because AdapterView is an abstract class, onNothingSelected must be defined
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                timeSelectedForPreparation = 10000;
            }
        });

    }
}