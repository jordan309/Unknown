package com.example.jordan307.unknown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewCount;
    private int mCount;

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
    private int mQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Activity set to full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        mTextViewCount = findViewById(R.id.answer1);


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

        updateQuestion();


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == mAnswer) {
                    updateQuestion();
                }
            }
        });


        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer) {
                    updateQuestion();
                }
            }

        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer) {
                    updateQuestion();
                }
            }
        });


    }

    private void updateQuestion() {
        if (mQuestionNumber < mQuestions.getLength()) {
            question.setText(mQuestions.getQuestions(mQuestionNumber));
            answer1.setText(mQuestions.getChoice1(mQuestionNumber));
            answer2.setText(mQuestions.getChoice2(mQuestionNumber));
            answer3.setText(mQuestions.getChoice3(mQuestionNumber));

            mAnswer = mQuestions.getCorrectAnswers(mQuestionNumber);
            mQuestionNumber++;

        }

    }

    private void decrement() {
        mCount++;
        mTextViewCount.setText(String.valueOf(mCount));
    }

}
