package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DailyTestQuestions extends AppCompatActivity {

    Button binaryTree, graph, heap, dynamicProgramming, array, LinkedList, stackQueue, backtracking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_test_questions);

        binaryTree = findViewById(R.id.binaryTreeDsButton);
        binaryTree.setBackgroundResource(000000);
        binaryTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DailyTestQuestions.this, BinaryTreeTestQuestions.class));
            }
        });

        graph = findViewById(R.id.GraphDsButton);
        graph.setBackgroundResource(000000);

        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DailyTestQuestions.this, MainActivity2.class));
            }
        });

        heap = findViewById(R.id.dailyTestHeap);
        heap.setBackgroundResource(000000);

        backtracking = findViewById(R.id.dailyTestBacktracking);
        backtracking.setBackgroundResource(000000);

        array = findViewById(R.id.dailyTestArray);
        array.setBackgroundResource(000000);

        dynamicProgramming = findViewById(R.id.dailyTestDynamicProgramming);
        dynamicProgramming.setBackgroundResource(000000);

        LinkedList = findViewById(R.id.dailyTestLinkedList);
        LinkedList.setBackgroundResource(000000);

        stackQueue = findViewById(R.id.dailyTestStack);
        stackQueue.setBackgroundResource(000000);
    }
}