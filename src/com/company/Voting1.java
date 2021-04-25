package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting1 {
    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    private int type ;

    public int getType() {
        return type;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }


    private String question ;
    ArrayList<Person> voters = new ArrayList<>();
    HashMap<String, HashSet<Vote>> choices = new HashMap<>();
    public Voting1(int type , String question){
        this.type=type;
        this.question = question;
    }


    public void createChoice(String Choice ){
        choices.put(Choice  , new HashSet<>());
    }

    public void printChoice(){
        for (String string : choices.keySet() ){
            System.out.println(string);
        }
      //  System.out.println(getChoices());
    }


    public void vote(Person person , ArrayList<String> arraylist){

    }



}
