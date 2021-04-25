package com.company;
import java.util.ArrayList;
public class VotingSystem {
    private String question ;

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    ArrayList<Voting> votingList = new ArrayList<>();

    public VotingSystem(){

    }


    public void createVoting(String question , int type ){
        votingList.add( new Voting(type , question));


    }

    public void printListOfVoting(){
        for (Voting voting : votingList){
            System.out.println(voting.getQuestion());
        }
    }

    public void printVoting(int index){
        votingList.get(index-1).printChoice();
    }




}
