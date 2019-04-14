package com.example.jordan307.unknown;

import android.os.PersistableBundle;
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


    private void initialScores() {
        foodScore.setText("Food " + foodValue + "%");
        waterScore.setText("Water " + waterValue + "%");
        sanityScore.setText("Sanity " + sanityValue + "%");
    }

    //Defining the buttons
    Button answer1, answer2, answer3;

    TextView foodScore, waterScore, sanityScore, question;

    private Questions mQuestions = new Questions();


    //Player resource variables
    private int foodValue = 100;
    private int waterValue = 100;
    private int sanityValue = 100;

    //Question Variables
    private String mA1AnswerEffectValues;
    private String mA2AnswerEffectValues;
    private String mA3AnswerEffectValues;
    private String mA1AnswerEffectOperator;
    private String mA2AnswerEffectOperator;
    private String mA3AnswerEffectOperator;
    private String mA1Type;
    private String mA2Type;
    private String mA3Type;

    //Question number variable
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

        //Associating the answer variables with the appropriate elements on the page
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);

        //Associating the resource and question variables with the appropriate elements on the page
        foodScore = findViewById(R.id.fscore);
        waterScore = findViewById(R.id.wscore);
        sanityScore = findViewById(R.id.sscore);
        question = findViewById(R.id.question);

        //Assigning text to the elements on the page based on the current values of the resources


        updateQuestion();
        initialScores();


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mA1Type) {
                    case "Hunger":
                        if (mA1AnswerEffectOperator == "Pos" ){
                            foodValue += Integer.parseInt(mA1AnswerEffectValues);
                        }else{
                            foodValue -= Integer.parseInt(mA1AnswerEffectValues);
                        }
                        break;
                    case "Water":
                        if (mA1AnswerEffectOperator == "Pos" ){
                            waterValue += Integer.parseInt(mA1AnswerEffectValues);
                        }else{
                            waterValue -= Integer.parseInt(mA1AnswerEffectValues);
                        }
                        break;
                    case "Sanity":
                        if (mA1AnswerEffectOperator == "Pos" ){
                            sanityValue += Integer.parseInt(mA1AnswerEffectValues);
                        }else{
                            sanityValue -= Integer.parseInt(mA1AnswerEffectValues);
                        }
                        break;

                }
                updateScores();
                updateQuestion();
            }
        });


        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mA2Type) {
                    case "Hunger":
                        if (mA2AnswerEffectOperator == "Pos" ){
                            foodValue += Integer.parseInt(mA2AnswerEffectValues);
                        }else{
                            foodValue -= Integer.parseInt(mA2AnswerEffectValues);
                        }
                        break;
                    case "Water":
                        if (mA2AnswerEffectOperator == "Pos" ){
                            waterValue += Integer.parseInt(mA2AnswerEffectValues);
                        }else{
                            waterValue -= Integer.parseInt(mA2AnswerEffectValues);
                        }
                        break;
                    case "Sanity":
                        if (mA2AnswerEffectOperator == "Pos" ){
                            sanityValue += Integer.parseInt(mA2AnswerEffectValues);
                        }else{
                            sanityValue -= Integer.parseInt(mA2AnswerEffectValues);
                        }
                        break;

                }
                updateScores();
                updateQuestion();
            }

        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mA3Type) {
                    case "Hunger":
                        if (mA3AnswerEffectOperator == "Pos" ){
                            foodValue += Integer.parseInt(mA3AnswerEffectValues);
                        }else{
                            foodValue -= Integer.parseInt(mA3AnswerEffectValues);
                        }
                        break;
                    case "Water":
                        if (mA3AnswerEffectOperator == "Pos" ){
                            waterValue += Integer.parseInt(mA3AnswerEffectValues);
                        }else{
                            waterValue -= Integer.parseInt(mA3AnswerEffectValues);
                        }
                        break;
                    case "Sanity":
                        if (mA3AnswerEffectOperator == "Pos" ){
                            sanityValue += Integer.parseInt(mA3AnswerEffectValues);
                        }else{
                            sanityValue -= Integer.parseInt(mA3AnswerEffectValues);
                        }
                        break;

                }
                updateScores();
                updateQuestion();

            }
        });


    }
    private void updateScores() {
        foodScore.setText("Food " + foodValue + "%");
        waterScore.setText("Water " + waterValue + "%");
        sanityScore.setText("Sanity " + sanityValue + "%");
    }

    private void updateQuestion() {
<<<<<<< HEAD
        if (mQuestionNumber < 51) {
=======
        if (mQuestionNumber < 50) {
>>>>>>> fb47c16df17a4d2be7a7f1c42581ad03dfdd6914
            question.setText(mQuestions.getQuestionData( mQuestionNumber,0,  0, 0, 0));



            answer1.setText(mQuestions.getQuestionData(mQuestionNumber, 1, 0, 0, 0));
            answer2.setText(mQuestions.getQuestionData(mQuestionNumber, 1, 1, 0, 0));
            answer3.setText(mQuestions.getQuestionData(mQuestionNumber, 1, 2, 0, 0));
            mA1AnswerEffectValues = mQuestions.getQuestionData(mQuestionNumber, 2, 0, 1, 0);
            mA2AnswerEffectValues = mQuestions.getQuestionData(mQuestionNumber, 2, 1, 1, 0);
            mA3AnswerEffectValues = mQuestions.getQuestionData(mQuestionNumber, 2, 2, 1, 0);
            mA1AnswerEffectOperator = mQuestions.getQuestionData(mQuestionNumber, 2, 0, 0, 0);
            mA2AnswerEffectOperator = mQuestions.getQuestionData(mQuestionNumber, 2, 1, 0, 0);
            mA3AnswerEffectOperator = mQuestions.getQuestionData(mQuestionNumber, 2, 2, 0, 0);
            mA1Type = mQuestions.getQuestionData(mQuestionNumber, 3, 0, 0, 0);
            mA2Type = mQuestions.getQuestionData(mQuestionNumber, 3, 1, 0, 0);
            mA3Type = mQuestions.getQuestionData(mQuestionNumber, 3, 2, 0, 0);

            mQuestionNumber++;

            System.out.println(mA1AnswerEffectValues);
        }

    }

    private void decrement() {
        mCount++;
        mTextViewCount.setText(String.valueOf(mCount));
    }


<<<<<<< HEAD
    //Save story, percentage levels on rotation
=======
>>>>>>> fb47c16df17a4d2be7a7f1c42581ad03dfdd6914
    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putString("story",question.getText().toString());
        outState.putString("answer1",answer1.getText().toString());
        outState.putString("answer2",answer2.getText().toString());
        outState.putString("answer3",answer3.getText().toString());
        outState.putString("sanity",sanityScore.getText().toString());
        outState.putString("water",waterScore.getText().toString());
        outState.putString("food",foodScore.getText().toString());
        super.onSaveInstanceState(outState);
    }

    //Restore story, percentage levels on rotation
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        question.setText(savedInstanceState.getString("story"));
        answer1.setText(savedInstanceState.getString("answer1"));
        answer2.setText(savedInstanceState.getString("answer2"));
        answer3.setText(savedInstanceState.getString("answer3"));
        sanityScore.setText(savedInstanceState.getString("sanity"));
        waterScore.setText(savedInstanceState.getString("water"));
        foodScore.setText(savedInstanceState.getString("food"));
    }
}
