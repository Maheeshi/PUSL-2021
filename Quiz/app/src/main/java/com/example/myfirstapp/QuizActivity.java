package com.example.myfirstapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    TextView tvTimer;
    TextView tvResult;
    ImageView ivShowImage;
    HashMap<String, Integer> map = new HashMap<>();
    ArrayList<String> signList = new ArrayList<>();
    int index;
    AppCompatButton btn1, btn2, btn3, btn4;
    TextView tvPoints;
    int points;
    CountDownTimer countDownTimer;
    long millisUntilFinished;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        tvTimer = findViewById(R.id.tvTimer);
        tvResult = findViewById(R.id.tvResult);
        ivShowImage = findViewById(R.id.ivShowImage);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        tvPoints = findViewById(R.id.tvPoints);

        index = 0;

        signList.add("A");
        signList.add("B");
        signList.add("C");
        signList.add("D");
        signList.add("E");
        signList.add("F");
        signList.add("G");
        signList.add("H");
        signList.add("I");
        signList.add("J");
        signList.add("K");
        signList.add("L");
        signList.add("M");
        signList.add("N");
        signList.add("O");
        signList.add("P");
        signList.add("Q");
        signList.add("R");
        signList.add("S");
        signList.add("T");
        signList.add("U");
        signList.add("V");
        signList.add("W");
        signList.add("X");
        signList.add("Y");
        signList.add("Z");
        signList.add("1");
        signList.add("2");
        signList.add("3");
        signList.add("4");
        signList.add("5");
        signList.add("6");
        signList.add("7");
        signList.add("8");
        signList.add("9");

        map.put(signList.get(0), R.drawable.a);
        map.put(signList.get(1), R.drawable.b);
        map.put(signList.get(2), R.drawable.c);
        map.put(signList.get(3), R.drawable.d);
        map.put(signList.get(4), R.drawable.e);
        map.put(signList.get(5), R.drawable.f);
        map.put(signList.get(6), R.drawable.g);
        map.put(signList.get(7), R.drawable.h);
        map.put(signList.get(8), R.drawable.i);
        map.put(signList.get(9), R.drawable.j);
        map.put(signList.get(10), R.drawable.k);
        map.put(signList.get(11), R.drawable.l);
        map.put(signList.get(12), R.drawable.m);
        map.put(signList.get(13), R.drawable.n);
        map.put(signList.get(14), R.drawable.o);
        map.put(signList.get(15), R.drawable.p);
        map.put(signList.get(16), R.drawable.q);
        map.put(signList.get(17), R.drawable.r);
        map.put(signList.get(18), R.drawable.s);
        map.put(signList.get(19), R.drawable.t);
        map.put(signList.get(20), R.drawable.u);
        map.put(signList.get(21), R.drawable.v);
        map.put(signList.get(22), R.drawable.w);
        map.put(signList.get(23), R.drawable.x);
        map.put(signList.get(24), R.drawable.y);
        map.put(signList.get(25), R.drawable.z);
        map.put(signList.get(26), R.drawable.number1);
        map.put(signList.get(27), R.drawable.number2);
        map.put(signList.get(28), R.drawable.number3);
        map.put(signList.get(29), R.drawable.number4);
        map.put(signList.get(30), R.drawable.number5);
        map.put(signList.get(31), R.drawable.number6);
        map.put(signList.get(32), R.drawable.number7);
        map.put(signList.get(33), R.drawable.number8);
        map.put(signList.get(34), R.drawable.number9);

        Collections.shuffle(signList);
        millisUntilFinished = 10000;
        points = 0;
        startGame();

    }

    private void startGame() {
        millisUntilFinished = 10000;
        tvTimer.setText("" + (millisUntilFinished / 1000) + "s");
        tvPoints.setText(points + " / " + signList.size());
        generateQuestions(index);
        countDownTimer = new CountDownTimer(millisUntilFinished, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvTimer.setText("" + (millisUntilFinished / 1000) + "s");

            }

            @Override
            public void onFinish() {
                index++;
                if(index > signList.size() - 1){
                    ivShowImage.setVisibility(View.GONE);
                    btn1.setVisibility(View.GONE);
                    btn2.setVisibility(View.GONE);
                    btn3.setVisibility(View.GONE);
                    btn4.setVisibility(View.GONE);
                    Intent intent = new Intent(QuizActivity.this, QuizResults.class);
                    intent.putExtra("points", points);
                    startActivity(intent);
                    finish();
                }else{
                    countDownTimer = null;
                    startGame();
                }
            }
        }.start();
    }

    private void generateQuestions(int index) {
        ArrayList<String> signListTemp = (ArrayList<String>) signList.clone();
        String correctAnswer = signList.get(index);
        signListTemp.remove(correctAnswer);
        Collections.shuffle(signListTemp);
        ArrayList<String> newList = new ArrayList<>();
        newList.add(signListTemp.get(0));
        newList.add(signListTemp.get(1));
        newList.add(signListTemp.get(2));
        newList.add(correctAnswer);

        Collections.shuffle(newList);

        btn1.setText(newList.get(0));
        btn2.setText(newList.get(1));
        btn3.setText(newList.get(2));
        btn4.setText(newList.get(3));
        ivShowImage.setImageResource(map.get(signList.get(index)));
    }

    public void nextQuestion(View view){
        btn1.setBackgroundColor(Color.parseColor("#FF3FAE3D"));
        btn2.setBackgroundColor(Color.parseColor("#FF3FAE3D"));
        btn3.setBackgroundColor(Color.parseColor("#FF3FAE3D"));
        btn4.setBackgroundColor(Color.parseColor("#FF3FAE3D"));

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);

        countDownTimer.cancel();
        index++;
        if(index > signList.size() - 1){
            ivShowImage.setVisibility(View.GONE);
            btn1.setVisibility(View.GONE);
            btn2.setVisibility(View.GONE);
            btn3.setVisibility(View.GONE);
            btn4.setVisibility(View.GONE);
            Intent intent = new Intent(QuizActivity.this, QuizResults.class);
            intent.putExtra("points", points);
            startActivity(intent);
            finish();
        }else{
            countDownTimer = null;
            startGame();
        }
    }

    public void answerSelected(View view){
        view.setBackgroundColor(Color.parseColor("#FF1F7318"));

        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);

        countDownTimer.cancel();
        String answer = ((AppCompatButton) view).getText().toString().trim();
        String correctAnswer = signList.get(index);
        if(answer.equals(correctAnswer)){
            points++;
            tvPoints.setText(points + " / " + signList.size());
            tvResult.setText("Correct!");
        }else{
            tvResult.setText("Incorrect!");
        }
    }
}