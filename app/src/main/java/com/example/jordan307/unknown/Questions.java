package com.example.jordan307.unknown;

public class Questions {

    public String mQuestions[] = {
            "They seem to be surrounding you, it is getting dark so you won't be able to see soon. You trip over a rock trying to escape and are injured, you were unable to find any food or water on your savaging hunt. ",
            "There are some survivors up ahead but I can avoid them if I follow the river along this path, I'm not sure if I want to risk getting robbed or worse, killed.",
            "I cannot see them but I have a gut feeling they are around me, I need to find somewhere to hide before it's too late"

    };

    private String mChoices[] [] = {
            {"Try to fight them off", "Get up", "Stay down", "Do nothing"},
            {"Walk to survivors", "Yell out to them", "Follow the river path", "Hide behind tree"},
            {"Go to abandoned building", "Go to a car nearby", "Hide outside", "Ignore it"}
    };

    private String mCorrectAnswers[] = {"Get up", "Follow the river path", "Go to a car nearby"};

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswers(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }



}
