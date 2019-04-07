package com.example.jordan307.unknown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    //Disable Back Button
    @Override
    public void onBackPressed(){}

    Button answer1, answer2, answer3;

    TextView foodScore, waterScore, sanityScore, question;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int foodValue = 100;
    private int waterValue = 100;
    private int sanityValue = 100;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Activity set to full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);

        foodScore = findViewById(R.id.fscore);
        waterScore = findViewById(R.id.wscore);
        sanityScore = findViewById(R.id.sscore);
        question = findViewById(R.id.question);

        foodScore.setText("Food " + foodValue + "%");
        waterScore.setText("Water " + waterValue + "%");
        sanityScore.setText("Sanity " + sanityValue + "%");

        updateQuestion(r.nextInt(mQuestionsLength));


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == mAnswer) {
                    foodValue--;
                    foodScore.setText("Food " + foodValue + "%");
                    updateQuestion(r.nextInt(mQuestionsLength));
                }
            }
        });


        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer) {
                    foodValue--;
                    foodScore.setText("Food " + foodValue + "%");
                    updateQuestion(r.nextInt(mQuestionsLength));
                }
            }

        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer) {
                    foodValue--;
                    foodScore.setText("Food " + foodValue + "%");
                    updateQuestion(r.nextInt(mQuestionsLength));
                }
            }
        });


    }

    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestions(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));

        mAnswer = mQuestions.getCorrectAnswers(num);
    }

}
