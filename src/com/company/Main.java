package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import ir.huri.jcal.JalaliCalendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        //JalaliCalendar jalaliCalendar1 = new JalaliCalendar(1395, 1, 28);
        //System.out.println(jalaliCalendar1.getYear());
        VotingSystem system = new VotingSystem();
       /* system.createVoting("do you love me do you do you ? " , 1);
        system.createVoting("whta is your name  ",2);
        system.votingList.get(0).createChoice("abou smai7");
        system.votingList.get(0).createChoice("hew");
        system.printVoting(1);
        */
        while (true){
            initialMenu();
            Scanner scanner1 = new Scanner(System.in);
            int choice1 = scanner1.nextInt();
            if (choice1==3)
                break;
            switch (choice1){
                case 1 :
                    int type = 0;
                    while (true){
                       // int type ;
                      //
                        //  String question ;
                        System.out.println(
                                "1 >> ENTER YOUR QUESTION AND TYPE OF VOTING  \n" +
                                "2 >> ENTER A CHOICE \n" +
                                "3 >> PRINT ALL CHOICE\n" +
                                "4 >> VOTE \n" +
                                "5 >> PRINT THE RESULT \n" +
                                        "6 >> BACK \n" +
                                " >> ENTER YOUR CHOICE  >> ");
                        Scanner scanner2 = new Scanner(System.in);
                        int choice2 = scanner2.nextInt();
                        if (choice2==6)
                            break;
                        switch (choice2){
                            case 1 :

                                while (true){
                                    System.out.println("1 >> 1 CHOICE TO VOTE \n" +
                                            "2 >> MULTIPLE CHOICE TO VOTE \n" +
                                            " PLEASE ENTER YOU CHOICE  >> ");

                                      type= scanner2.nextInt();
                                    if(type==2 || type==1){
                                        System.out.println("COMPLETED !");
                                        break;
                                    }else {
                                        System.out.println("PLEASE ENTER A WRIGHT CHOICE");
                                    }
                                }
                                System.out.println("PLEASE ENTER YOUR QUESTION ");
                                Scanner scanner = new Scanner(System.in);
                                  String question = scanner.nextLine();
                                system.createVoting(question , type);
                                System.out.println("YOUR VOTING IS CREATED !");
                                break;
                            case 2 :
                                System.out.println("PLEASE ENTER YOUR CHOICE ");
                                Scanner scanner3 = new Scanner(System.in);
                                String choice = scanner3.nextLine();
                                system.votingList.get(system.votingList.size()-1).createChoice(choice);
                                System.out.println("YOUR CHOICE HAS BEEN CREATED");
                                break;
                            case 3 :
                                System.out.println("ALL CHOICES  >>");
                                system.votingList.get(system.votingList.size()-1).printChoice();
                                break;
                            case 4 :
                               // system.votingList.get(system.votingList.size() - 1).pv();
                                Scanner scanner4 = new Scanner(System.in);
                                System.out.println("YOU WANT TO VOTE \n " +
                                        "PLEASE ENTER YOU FIRST NAME ");
                                String fN = scanner4.nextLine();
                                System.out.println("PLEASE ENTER YOUR LAST NAME ");
                                String lN = scanner4.nextLine();
                                System.out.println("PLEASE ENTER YOUR CHOICE (IF YOU WANT A RANDOM CHOICE ENTER : RANDOM )");
                                String newchoice = scanner4.nextLine();
                                Person person = new Person(fN , lN);
                                if (!system.votingList.get(system.votingList.size() - 1).voters.contains(person))
                                    system.votingList.get(system.votingList.size() - 1).voters.add(person);
                                if (newchoice.equals("RANDOM")){
                                   // Person person1 = new Person(fN , lN);
                                    Random generator = new Random();
                                    int counter =0;
                                    int r = generator.nextInt(system.votingList.get(system.votingList.size()-1).choices.size());
                                    for (String st : system.votingList.get(system.votingList.size()-1).choices.keySet()){
                                        if (counter==r-1){
                                            system.votingList.get(system.votingList.size() - 1).getChoices().get(st).add(new Vote(person));
                                            system.votingList.get(system.votingList.size() - 1).voters.add(person);
                                        }

                                        counter++;
                                    }
                                }
                                else{
                                if (system.votingList.get(system.votingList.size()-1).getChoices().containsKey(newchoice)){
                                    if (type==2) {
                                        system.votingList.get(system.votingList.size() - 1).getChoices().get(newchoice).add(new Vote(person));
                                        system.votingList.get(system.votingList.size() - 1).voters.add(person);
                                    }
                                    else if (type==1){
                                        if (!system.votingList.get(system.votingList.size() - 1).voters.contains(person)){
                                            system.votingList.get(system.votingList.size() - 1).getChoices().get(newchoice).add(new Vote(person));
                                            system.votingList.get(system.votingList.size() - 1).voters.add(person);
                                        }else if (system.votingList.get(system.votingList.size() - 1).voters.contains(person)){
                                            System.out.println("you can not choose more than one choice ");
                                        }
                                    }

                                }else {
                                    system.votingList.get(system.votingList.size()-1).createChoice(newchoice);
                                }}
                                break;
                            case 5 :

                                system.votingList.get(system.votingList.size()-1).choices.entrySet().forEach(entry -> {
                                    System.out.println(entry.getKey() + " " + entry.getValue().size());
                                });

                                break;
                        }


                    }
                    break;
                case 2 :
                    system.printListOfVoting();
                    break;

            }




        }

    }



    public static void initialMenu(){
        System.out.println("1 >> CREATR A VOTING \n2 >> PRINT ALL VOTINGS \n3 >> EXIT PROGRAM");
    }

}
