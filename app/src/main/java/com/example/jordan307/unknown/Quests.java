package com.example.jordan307.unknown;

public class Quests {

    private int mWater;
    private int mHunger;
    private int mSanity;
    private String mQuestion;
    private String mOption1;
    private String mOption2;
    private String mOption3;

    public Quests(int mHunger, int mWater, int mSanity, String mQuestion, String mOption1, String mOption2, String mOption3){
        this.mHunger = mHunger;
        this.mWater = mWater;
        this.mSanity = mSanity;
        this.mQuestion = mQuestion;
        this.mOption1 = mOption1;
        this.mOption2 = mOption2;
        this.mOption3 = mOption3;
    }

    public int getmHunger() {
        return mHunger;
    }

    public int getmWater() {
        return mWater;
    }

    public int getmSanity() {
        return mSanity;
    }

    public String getmQuestion() {
        return mQuestion;
    }
    public String getmOption1() {
        return mOption1;
    }

    public String getmOption2() {
        return mOption2;
    }

    public String getmOption3() {
        return mOption3;
    }

}
