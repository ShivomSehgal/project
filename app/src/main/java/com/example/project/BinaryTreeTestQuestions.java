package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project.R;

public class BinaryTreeTestQuestions extends AppCompatActivity {

    private static final long startTime = 10000;

    private long timeLeft = startTime;

    CountDownTimer mCountDownTimer;

    TextView levelOrder, reverseOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_tree_test_questions);

        levelOrder = findViewById(R.id.levelOrderTraversal);
        levelOrder.setMovementMethod(LinkMovementMethod.getInstance());

        reverseOrder = findViewById(R.id.reverselevelOrderTraversal);
        reverseOrder.setMovementMethod(LinkMovementMethod.getInstance());

        mCountDownTimer = new CountDownTimer(timeLeft, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeft = millisUntilFinished;
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(BinaryTreeTestQuestions.this, HomeScreen.class));
                Toast.makeText(BinaryTreeTestQuestions.this, "DSA Daily Limit reached", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
}