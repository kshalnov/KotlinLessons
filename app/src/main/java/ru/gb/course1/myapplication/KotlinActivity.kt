package ru.gb.course1.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {
    private lateinit var plusButton: Button
    private lateinit var minusButton: Button
    private lateinit var counterTextView: TextView

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        initViews()

        counterTextView.setTextColor(Color.BLUE)

        updateCounterTextView(counter)

//        minusButton.setOnClickListener { updateCounterTextView(--counter) }
        minusButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                updateCounterTextView(--counter)
            }
        })
//        plusButton.setOnClickListener({ v: View ->
//            updateCounterTextView(++counter)
//        })
        plusButton.setOnClickListener() {
            updateCounterTextView(++counter)
        }

    }

    private fun updateCounterTextView(counter: Int) {
        counterTextView.text = counter.toString()
    }

    private fun initViews() {
        minusButton = findViewById(R.id.minus_button)
        plusButton = findViewById(R.id.plus_button)
        counterTextView = findViewById(R.id.counter_text_view)
    }
}