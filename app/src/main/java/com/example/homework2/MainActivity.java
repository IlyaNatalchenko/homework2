package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private Button button2;

    private int button01 = 0;
    private int button02 = 0;

    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        textView1 = findViewById(R.id.textView1);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button){
            this.button01 = 1;
            textView1.setText(String.valueOf(button01));
        }
        else if (view.getId() == R.id.button2) {
            this.button02 = 2;
            textView1.setText(String.valueOf(button02));
        }
    }
}