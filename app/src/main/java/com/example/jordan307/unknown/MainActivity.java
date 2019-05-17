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

    //Countdown timer will start at 20 seconds
    private static final long COUNTDOWN_IN_MILLIS = 21000;

    //Internal storage saving string
    private static final String FILE_NAME = "saved.txt";

    //Defining text views for functions to make use of
    private TextView mTextViewCount;
    private int mCount;
    private TextView textViewCountDown;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    //Disable Back Button
    @Override
    public void onBackPressed() {
    }


    //Function that sets the initial player resource values based on the character they chose in the character select screen
    private void initialScores() {
        switch (Name) {
            //Contains variations on starting resources variables based on evelyns story
            case "evelyn": {
                foodValue = 150;
                sanityValue = 80;
                foodScore.setText("Food " + foodValue + "%");
                waterScore.setText("Water " + waterValue + "%");
                sanityScore.setText("Sanity " + sanityValue + "%");
                break;
            }

            //Contains variations on starting resources variables based on trevors story
            case "trevor": {
                waterValue = 150;
                foodValue = 80;
                foodScore.setText("Food " + foodValue + "%");
                waterScore.setText("Water " + waterValue + "%");
                sanityScore.setText("Sanity " + sanityValue + "%");
                break;
            }

            //Contains variations on starting resources variables based on amys story
            case "amy": {
                sanityValue = 150;
                waterValue = 80;
                foodScore.setText("Food " + foodValue + "%");
                waterScore.setText("Water " + waterValue + "%");
                sanityScore.setText("Sanity " + sanityValue + "%");
                break;
            }
            //Contains variations on starting resources variables based on connors story
            case "connor": {
                foodValue = 110;
                waterValue = 110;
                sanityValue = 110;
                foodScore.setText("Food " + foodValue + "%");
                waterScore.setText("Water " + waterValue + "%");
                sanityScore.setText("Sanity " + sanityValue + "%");
                break;
            }

        }

    }

    /* We had some issues / bugs trying to save and load the game. We decided it would be best
       to leave out this feature as it would make the challenge of winning easier. Whereas, having no
       save option would increase the difficulty of the game and make it addictive to play.

    //Saving strings to internal storage on device
    public void save(View v) {
        String food = foodScore.getText().toString();
        String water = waterScore.getText().toString();
        String sanity = sanityScore.getText().toString();
        String hello = question.getText().toString();
        String bye = dResults.getText().toString();
        String one = answer1.getText().toString();
        String two = answer2.getText().toString();
        String three = answer3.getText().toString();
        FileOutputStream fos = null;

        try {
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(hello.getBytes());
            fos.write(bye.getBytes());
            fos.write(food.getBytes());
            fos.write(water.getBytes());
            fos.write(sanity.getBytes());
            fos.write(one.getBytes());
            fos.write(two.getBytes());
            fos.write(three.getBytes());
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

    //Loading strings from internal storage on device
    public void load(View v) {
        FileInputStream fis = null;

        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;

            while ((text = br.readLine()) != null) {
                sb.append(text).append("\n");
            }

            answer1.setText(sb.toString());
            answer2.setText(sb.toString());
            answer3.setText(sb.toString());
            question.setText(sb.toString());
            dResults.setText(sb.toString());
            foodScore.setText(sb.toString());
            waterScore.setText(sb.toString());
            sanityScore.setText(sb.toString());


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

    */


    //Defining in game buttons for functions to make use of
    Button answer1, answer2, answer3;

    //Defining text views for functions to make use of
    TextView foodScore, waterScore, sanityScore, question, dResults;
    //Number of questions that have been completed so far which is used as a reference for the main game array
    private Questions mQuestions = new Questions();
    private int mQuestionNumber = 0;

    //Sets base player resource values before character class modifications
    private int foodValue = 100;
    private int waterValue = 100;
    private int sanityValue = 100;


    //Question and core gameplay variables taken from the main gameplay array.
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


    //Character variable taken from character select activity
    private String Name = CharacterSelect.characterName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Activity set to full screen
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


        //When the first answer button is selected the following code will run
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //A switch that will check which resource is being altered based on the players answer and determine if it is to be subtracted or added to
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
                countDownTimer.cancel();
                dResults.setText(mA1RDialog);
                answerMaint();

            }
        });

        //When the second answer button is selected the following code will run
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //A switch that will check which resource is being altered based on the players answer and determine if it is to be subtracted or added to
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
                countDownTimer.cancel();
                dResults.setText(mA2RDialog);
                answerMaint();

            }

        });

        //When the third answer button is selected the following code will run
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //A switch that will check which resource is being altered based on the players answer and determine if it is to be subtracted or added to
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
                countDownTimer.cancel();
                dResults.setText(mA3RDialog);
                answerMaint();

            }
        });


    }

    //A function that is used to run other functions and save duplicating code every time each of these tasks must be run
    private void answerMaint() {
        updateScores();
        updateQuestion();
        winCheck();
        FoodLoseCheck();
        SanityLoseCheck();
        WaterLoseCheck();
    }

    //Updates the game scores based on current values stored within each of the score variables
    private void updateScores() {
        foodScore.setText("Food " + foodValue + "%");
        waterScore.setText("Water " + waterValue + "%");
        sanityScore.setText("Sanity " + sanityValue + "%");
    }

    //Checks if the player has beaten the game by completing the final question
    private void winCheck() {
        if (mQuestionNumber >= 51) {
            Intent intent = new Intent(getApplicationContext(), GameWin.class);
            startActivity(intent);
        }
    }

    //Checks the players food score to see if it is less than or equal to 0 resulting in a game loss.
    private void FoodLoseCheck() {
        if (foodValue <= 0) {
            Intent intent = new Intent(getApplicationContext(), GameLossFood.class);
            startActivity(intent);
        }
    }

    //Checks the players sanity score to see if it is less than or equal to 0 resulting in a game loss.
    private void SanityLoseCheck() {
        if (sanityValue <= 0) {
            Intent intent = new Intent(getApplicationContext(), GameLossSanity.class);
            startActivity(intent);
        }
    }

    //Checks the players water score to see if it is less than or equal to 0 resulting in a game loss.
    private void WaterLoseCheck() {
        if (waterValue <= 0) {
            Intent intent = new Intent(getApplicationContext(), GameLossWater.class);
            startActivity(intent);
        }
    }

    /*Updates the games data variables from the data stored in the main game array. Each time this function is run it will fetch new data from the
    array based on the games current question number*/

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

    //Creates a new countdown and when it finishes
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
                foodValue = foodValue - 20;
                waterValue = waterValue - 20;
                sanityValue = sanityValue - 20;
            }
        }.start();
    }

    //Defines the measurements of the countdown
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

    //Cancel countdown
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }


}
