package udemy.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Player, please choice Rock, Paper or Scissor: ");
        String playerChoice = scanner.nextLine();
        String computerChoice = "Paper";
        // Print out choices
        System.out.println("Player has chosen " + playerChoice + " and Computer has chosen " + computerChoice + ".");

        // Determine who wins the match
        if (playerChoice.equals(computerChoice)) {
            System.out.println("Players Tied");
        } else if (playerChoice.equals("Rock") && computerChoice.equals("Paper")) {
            System.out.println("Computer WINS with " + computerChoice);
        } else if (computerChoice.equals("Rock") && playerChoice.equals("Paper")) {
            System.out.println("Player WINS with " + playerChoice);
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            System.out.println("Player WINS with " + playerChoice);
        } else if (computerChoice.equals("Scissors") && playerChoice.equals("Paper")) {
            System.out.println("Computer WINS with " + computerChoice);
        } else if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            System.out.println("Player WINS with " + playerChoice);
        } else if (computerChoice.equals("Rock") && playerChoice.equals("Scissors")) {
            System.out.println("Computer WINS with " + computerChoice);
        } else {
            System.out.println("Something broke in seeing who wins...");
        }
            scanner.close();
        }

//    public static void playOneMatch() {

        // TODO: could create a class for player that has a name, score(match, round, game total), choice, etc
        // TODO: build a function that returns who won each match, round, game
        // TODO: create loops for a round ( while match wins < 4) and for a game (while round wins < 4)
        // TODO: have everything separated into correct files/classes and not in main method
        // TODO: phase goal: be able to run with the command line and have the terminal read out who wins each match, round and then the game winner

        // TODO: goals after phase: build a UI
    //          use Rest Template,
    //          hit a DB and record scores and winning records,
    //          integrate Springboot,
    //          allow for user to play computer,
    //          add in React,
    //          continue to refactor,

//    }

}
