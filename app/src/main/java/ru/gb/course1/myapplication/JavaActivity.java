package ru.gb.course1.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaActivity extends AppCompatActivity {
    private Button plusButton;
    private Button minusButton;
    private TextView counterTextView;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        initViews();

        counterTextView.setTextColor(Color.RED);

        updateCounterTextView(counter);

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateCounterTextView(--counter);
            }
        });

        plusButton.setOnClickListener(view -> {
            updateCounterTextView(++counter);
        });
    }

    private void updateCounterTextView(int counter) {
        counterTextView.setText(String.valueOf(counter));
    }

    private void initViews() {
        minusButton = findViewById(R.id.minus_button);
        plusButton = findViewById(R.id.plus_button);
        counterTextView = findViewById(R.id.counter_text_view);
    }
}