package com.example.jordan307.unknown;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class CharacterSelect extends AppCompatActivity {

    public static String characterName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Activity set to full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_character_select);



        //Select Evelyn
        final Button evelyn = (Button) findViewById(R.id.CharacterEvelyn);
        evelyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evelyn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        characterName = "evelyn";
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });

        //Select Trevor
        final Button Trevor = (Button) findViewById(R.id.CharacterTrevor);
        Trevor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Trevor.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        characterName = "trevor";
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });

        //Select Amy
        final Button amy = (Button) findViewById(R.id.CharacterAmy);
        amy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        characterName = "amy";
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });

        //Select Connor
        final Button Connor = (Button) findViewById(R.id.CharacterConnor);
        Connor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Connor.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        characterName = "connor";
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });


    }

}
