package com.example.jordan307.unknown;

public class Questions {

    public int getLength(){return mQuestions.length;}

    public String mQuestions[] = {
            "You open your eyes and can't remember anything. You are so hungry and need to eat something as soon as possible, you are at a camp site and notice some old food lying around. An apple that is soft to the touch, some moldy bread and some meat.",
            "Your vision is a little blurry but you can see something moving in the distance. You don't know how you got outside or what is happening.",
            "You aren't sure if what you just saw was real or you are hallucinating you need to find a clue and try to remember. You are in the middle of the campsite with a small village ahead and a forest behind you.",
            "You take your backpack that contains your belongings, you find your phone and view messages in an attempt to remember what happened last. You see a message from a friend. They have surrounded me, 37.8136° S, 144.9631° E.",
            "You arrive at the destination, you see your friend is in trouble. He is running for his life, he trips and falls to the ground in pain. He looks injured and there are spirits approaching fast.",
            "Your friend has a wound to their leg, they need to reduce the pain and swelling fast. You know you can't stop driving but need to help your friend.",
            "Your friend takes your backpack and jumps out of the car while it's moving. The road ahead is blocked off by fallen trees and destroyed vehicles.",
            "It will be nighttime soon, you will need to find food and a place to sleep. You see what used to be a shopping centre in the distance, they should have backpacks in their but most likely spirits will be around.",
            "You remember seeing an isolated house not far from here on your drive. It's dangerous to travel at night but it's not safe to also stay here. It will take stealth, strength and courage to survive outside at night. There is no easy way out of this.",
            "You shut all windows and doors. You hear them outside but you can't see them. You are starting to feel anxious and paranoid that they may know you're inside the house. You see a fireplace upstairs in the main living room, there are logs of wood with a lighter nearby it.",
            "A new day is here, you see a thin book on a desk in the study and decide to read it. It has three different methods to ward off spirits and you know you have to try one of them! You find the materials for each method around the house.",
            "You can't stay in this house and need to make your next move you assess the house for supplies and find a radio which you can call for help with but you aren't sure how the spirits will react to it, you feel they might still be near by.",
            "The spirits come into the house, they must have heard the radio signal! You jump out through the window and see one right in front of you. It's coming towards you.",
            "You sense and feel death. Whispers in the distance, you're starting to lose your sanity. What's the point anymore? You think to yourself. It's not worth living in a world that is unlivable.",
            "You quickly snap out and see your friend who stole your backpack trapped by spirits with no escape. They will not survive unless you intervene and do something.",




    };

    private String mChoices[] [] = {
            {"Eat the Meat", "Eat the Bread", "Eat the Apple"},
            {"Approach object", "Hide behind camp tent to get a better look", "Pour water over your eyes"},
            {"Search Forest For Clues", "Search Town for Clues", "Search campsite for clues"},
            {"Find boat", "Find bike", "Find a vehicle"},
            {"Run spirits over", "Lure the spirits to another direction", "Drive to friend"},
            {"Give water to your friend without turning around", "Ignore your friend", "Turn around to hand your friend water"},
            {"Ditch car, go after friend", "Ditch car, run to nearby river", "Ditch car, quietly go to nearby river"},
            {"Don't take the risk", "Go back to the car", "Go to the shopping centre"},
            {"Take your time", "Avoid spirits seeing you", "Run as fast as you can to the house"},
            {"Do not light the fireplace", "Only take 1 wood log and light the fireplace", "Take the woodpile and light the fireplace"},
            {"Light incense candles", "Mark each door with ash from the fireplace", "Salt all of the entrances of the building"},
            {"Use the radio", "Sneak out of the house and get as far as you can before using radio", "Look around for more clues"},
            {"Run through the spirit", "Duck", "Run around the spirit"},
            {"Let the spirits take your soul!", "Think of Oakville", "Think of a memory"},
            {"Let your friend die", "Scream to get the spirits attention", "Go over and help"}
    };

    private String mCorrectAnswers[] = {"Eat the Apple", "Pour water over your eyes", "Search campsite for clues",
            "Find a vehicle", "Drive to friend", "Turn around to hand your friend water", "Ditch car, quietly go to nearby river",
            "Go to the shopping centre", "Run as fast as you can to the house", "Take the woodpile and light the fireplace",
            "Salt all of the entrances of the building", "Look around for more clues", "Run around the spirit", "Think of a memory",
            "Go over and help"};

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
