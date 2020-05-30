package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Team team1= new Team("t1");
        Team team2= new Team("t2");

        Generic generic= new Generic();
        generic.add(team1);
        generic.add(team2);

        generic.print(team1);
        generic.print(team2);

        generic.scoring(team1, team2);


        generic.print(team1);
        generic.print(team2);


    }
}
