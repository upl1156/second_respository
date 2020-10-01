package com.example.change_score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="MainActivity";
    private TextView mTextView;
    private Button Btn1;
    private Button Btn2;
    private Button Btn3;
    private int score = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView=(TextView)findViewById(R.id.txt1);
        Btn1=(Button)findViewById(R.id.button1);
        Btn2=(Button)findViewById(R.id.button2);
        Btn3=(Button)findViewById(R.id.button3);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score-5;


                mTextView.setText(String.valueOf(score));
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;


                mTextView.setText(String.valueOf(score));
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score+5;
                mTextView.setText(String.valueOf(score));
            }
        });














    }
}