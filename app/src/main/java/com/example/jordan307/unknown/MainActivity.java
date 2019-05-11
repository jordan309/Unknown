package com.example.jordan307.unknown;

import android.content.Intent;
import android.graphics.Color;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final long COUNTDOWN_IN_MILLIS = 20000;

    private static final String FILE_NAME = "saved.txt";

    private TextView mTextViewCount;
    private int mCount;

    private TextView textViewCountDown;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    //Disable Back Button
    @Override
    public void onBackPressed() {
    }


    private void initialScores() {
        foodScore.setText("Food " + foodValue + "%");
        waterScore.setText("Water " + waterValue + "%");
        sanityScore.setText("Sanity " + sanityValue + "%");
    }

    public void save(View v) {
        String text = question.getText().toString();
        FileOutputStream fos = null;

        try {
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Save to " + getFilesDir() + "/" + FILE_NAME, Toast.LENGTH_LONG).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void load(View v) {
        FileInputStream fis = null;

        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;

            while ((text = br.readLine()) != null) {
                sb.append(text);
            }

            question.setText(sb.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //Defining the buttons
    Button answer1, answer2, answer3;

    TextView foodScore, waterScore, sanityScore, question, dResults;

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
    private String mA1RDialog;
    private String mA2RDialog;
    private String mA3RDialog;

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
        dResults = findViewById(R.id.dresults);

        textViewCountDown = findViewById(R.id.text_view_countdown);

        //Assigning text to the elements on the page based on the current values of the resources
        updateQuestion();
        initialScores();


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mA1Type) {
                    case "Hunger":
                        if (mA1AnswerEffectOperator == "Pos") {
                            foodValue += Integer.parseInt(mA1AnswerEffectValues);
                        } else {
                            foodValue -= Integer.parseInt(mA1AnswerEffectValues);
                        }
                        break;
                    case "Water":
                        if (mA1AnswerEffectOperator == "Pos") {
                            waterValue += Integer.parseInt(mA1AnswerEffectValues);
                        } else {
                            waterValue -= Integer.parseInt(mA1AnswerEffectValues);
                        }
                        break;
                    case "Sanity":
                        if (mA1AnswerEffectOperator == "Pos") {
                            sanityValue += Integer.parseInt(mA1AnswerEffectValues);
                        } else {
                            sanityValue -= Integer.parseInt(mA1AnswerEffectValues);
                        }
                        break;

                }
                dResults.setText(mA1RDialog);
                updateScores();
                updateQuestion();
                winCheck();
                FoodLoseCheck();
                SanityLoseCheck();
                WaterLoseCheck();
            }
        });


        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mA2Type) {
                    case "Hunger":
                        if (mA2AnswerEffectOperator == "Pos") {
                            foodValue += Integer.parseInt(mA2AnswerEffectValues);
                        } else {
                            foodValue -= Integer.parseInt(mA2AnswerEffectValues);
                        }
                        break;
                    case "Water":
                        if (mA2AnswerEffectOperator == "Pos") {
                            waterValue += Integer.parseInt(mA2AnswerEffectValues);
                        } else {
                            waterValue -= Integer.parseInt(mA2AnswerEffectValues);
                        }
                        break;
                    case "Sanity":
                        if (mA2AnswerEffectOperator == "Pos") {
                            sanityValue += Integer.parseInt(mA2AnswerEffectValues);
                        } else {
                            sanityValue -= Integer.parseInt(mA2AnswerEffectValues);
                        }
                        break;

                }
                dResults.setText(mA2RDialog);
                updateScores();
                updateQuestion();
                winCheck();
                FoodLoseCheck();
                SanityLoseCheck();
                WaterLoseCheck();

            }

        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mA3Type) {
                    case "Hunger":
                        if (mA3AnswerEffectOperator == "Pos") {
                            foodValue += Integer.parseInt(mA3AnswerEffectValues);
                        } else {
                            foodValue -= Integer.parseInt(mA3AnswerEffectValues);
                        }
                        break;
                    case "Water":
                        if (mA3AnswerEffectOperator == "Pos") {
                            waterValue += Integer.parseInt(mA3AnswerEffectValues);
                        } else {
                            waterValue -= Integer.parseInt(mA3AnswerEffectValues);
                        }
                        break;
                    case "Sanity":
                        if (mA3AnswerEffectOperator == "Pos") {
                            sanityValue += Integer.parseInt(mA3AnswerEffectValues);
                        } else {
                            sanityValue -= Integer.parseInt(mA3AnswerEffectValues);
                        }
                        break;

                }
                dResults.setText(mA3RDialog);
                updateScores();
                updateQuestion();
                winCheck();
                FoodLoseCheck();
                SanityLoseCheck();
                WaterLoseCheck();

            }
        });


    }

    private void updateScores() {
        foodScore.setText("Food " + foodValue + "%");
        waterScore.setText("Water " + waterValue + "%");
        sanityScore.setText("Sanity " + sanityValue + "%");
    }

    private void winCheck() {
        if (mQuestionNumber >= 51) {
            Intent intent = new Intent(getApplicationContext(), GameWin.class);
            startActivity(intent);
        }
    }

    private void FoodLoseCheck() {
        if (foodValue <= 0) {
            Intent intent = new Intent(getApplicationContext(), GameLossFood.class);
            startActivity(intent);
        }
    }

    private void SanityLoseCheck() {
        if (sanityValue <= 0) {
            Intent intent = new Intent(getApplicationContext(), GameLossSanity.class);
            startActivity(intent);
        }
    }

    private void WaterLoseCheck() {
        if (waterValue <= 0) {
            Intent intent = new Intent(getApplicationContext(), GameLossWater.class);
            startActivity(intent);
        }
    }

    private void updateQuestion() {
        if (mQuestionNumber < 51) {
            question.setText(mQuestions.getQuestionData(mQuestionNumber, 0, 0, 0, 0));

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
            mA1RDialog = mQuestions.getQuestionData(mQuestionNumber, 4, 0, 0, 0);
            mA2RDialog = mQuestions.getQuestionData(mQuestionNumber, 4, 1, 0, 0);
            mA3RDialog = mQuestions.getQuestionData(mQuestionNumber, 4, 2, 0, 0);


            mQuestionNumber++;
            timeLeftInMillis = COUNTDOWN_IN_MILLIS;
            startCountdown();

            System.out.println(mA1AnswerEffectValues);
        }

    }

    private void startCountdown() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountDownText();

            }
        }.start();
    }

    private void updateCountDownText() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        textViewCountDown.setText(timeFormatted);

        if (timeLeftInMillis < 10000) {
        }
    }


    private void decrement() {
        mCount++;
        mTextViewCount.setText(String.valueOf(mCount));
    }


    //Save story, percentage levels on rotation
    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putString("story", question.getText().toString());
        outState.putString("answer1", answer1.getText().toString());
        outState.putString("answer2", answer2.getText().toString());
        outState.putString("answer3", answer3.getText().toString());
        outState.putString("sanity", sanityScore.getText().toString());
        outState.putString("water", waterScore.getText().toString());
        outState.putString("food", foodScore.getText().toString());
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }


}
