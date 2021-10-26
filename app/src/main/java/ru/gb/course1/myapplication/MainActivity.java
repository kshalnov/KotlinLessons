package ru.gb.course1.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button javaButton;
    private Button kotlinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        javaButton = findViewById(R.id.java_button);
        javaButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, JavaActivity.class);
            startActivity(intent);
        });

        kotlinButton = findViewById(R.id.kotlin_button);
        kotlinButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, KotlinActivity.class);
            startActivity(intent);
        });
    }

}