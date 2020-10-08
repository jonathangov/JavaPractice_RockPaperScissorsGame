package udemy.practice;

public class Main {

    public static void main(String[] args) {
	    playOneMatch("Rock", "Paper");

    }

    public static void playOneMatch(String playerOneChoice, String playerTwoChoice) {

        // could create a class for player that has a name, score(match, round, game total), choice, etc
        // build a function that returns who won each match, round, game
        // create loops for a round ( while match wins < 4) and for a game (while round wins < 4)
        // have everything separated into correct files/classes and not in main method
        // phase 1 goal: be able to run with the command line and have the terminal read out who wins each match, round and then the game winner

        // goals after phase 1: build a UI, use Rest Template, integrate Springboot, allow for 1 user to play computer, add in React, continue to refactor

        if(playerOneChoice == playerTwoChoice) {
            System.out.println("Players Tied");
//            playOneMatch();
        } else if(playerOneChoice == "Rock" && playerTwoChoice == "Paper") {
            System.out.println("Player 2 WINS with " + playerTwoChoice);
        } else if(playerTwoChoice == "Rock" && playerOneChoice == "Paper") {
            System.out.println("Player 1 WINS with " + playerOneChoice);
        } else if(playerOneChoice == "Scissors" && playerTwoChoice == "Paper") {
            System.out.println("Player 1 WINS with " + playerOneChoice);
        } else if(playerTwoChoice == "Scissors" && playerOneChoice == "Paper") {
            System.out.println("Player 2 WINS with " + playerTwoChoice);
        } else if(playerOneChoice == "Rock" && playerTwoChoice == "Scissors") {
            System.out.println("Player 1 WINS with " + playerOneChoice);
        } else if(playerTwoChoice == "Rock" && playerOneChoice == "Scissors") {
            System.out.println("Player 2 WINS with " + playerTwoChoice);
        }
    }
}
