package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CoreFundamentals extends AppCompatActivity {

    private static final long startTime = MainActivity2.timeSelectedForPreparation;

    private double timeLeft = startTime*.05;

    CountDownTimer mCountDownTimer;

    Button OsButton, CnButton, DbmsButton, OopsButton;
    TextView CnMcq, CnCheatSheet,CheatSheetDatabase, mcqDatabase, CheatSheetObjectOriented,mcqObjectOriented,
            CheatSheetOperatingSystem, mcqOperatingSystem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core_fundamentals);

        OsButton = findViewById(R.id.operatingSystem);
        OsButton.setBackgroundResource(000000);
        CnButton = findViewById(R.id.ComputerNetworking);
        CnButton.setBackgroundResource(000000);
        DbmsButton = findViewById(R.id.DatabaseManagement);
        DbmsButton.setBackgroundResource(000000);
        OopsButton = findViewById(R.id.objectOrientedProgramming);
        OopsButton.setBackgroundResource(000000);

        CnMcq = findViewById(R.id.mcqCn);
        CnCheatSheet = findViewById(R.id.csCn);

        CnMcq.setMovementMethod(LinkMovementMethod.getInstance());
        CnCheatSheet.setMovementMethod(LinkMovementMethod.getInstance());

        CheatSheetDatabase = findViewById(R.id.databaseCheatsheet);
        mcqDatabase = findViewById(R.id.databaseMcq);

        CheatSheetDatabase.setMovementMethod(LinkMovementMethod.getInstance());
        mcqDatabase.setMovementMethod(LinkMovementMethod.getInstance());

        CheatSheetObjectOriented = findViewById(R.id.objectOrientedProgrammingCheatSheet);
        mcqObjectOriented = findViewById(R.id.objectOrientedProgrammingMcq);

        CheatSheetObjectOriented.setMovementMethod(LinkMovementMethod.getInstance());
        mcqObjectOriented.setMovementMethod(LinkMovementMethod.getInstance());

        CheatSheetOperatingSystem = findViewById(R.id.operatingSystemCheatsheet);
        mcqOperatingSystem = findViewById(R.id.operatingSystemMcq);

        CheatSheetOperatingSystem.setMovementMethod(LinkMovementMethod.getInstance());
        mcqOperatingSystem.setMovementMethod(LinkMovementMethod.getInstance());

        mCountDownTimer = new CountDownTimer((long)timeLeft, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeft = millisUntilFinished;
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(CoreFundamentals.this, HomeScreen.class));
                Toast.makeText(CoreFundamentals.this, "Core Fundamentals Daily Limit reached", Toast.LENGTH_SHORT).show();
            }
        }.start();


    }
}