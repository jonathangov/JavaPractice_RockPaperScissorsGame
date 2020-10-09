package udemy.practice;

import java.util.Scanner;

public class Main {

    // TODO: could create a class for player that has a name, score(match, round, game total), choice, etc
    // TODO: build a function that returns who won each match, round, game
    // TODO: create loops for a round ( while match wins < 4) and for a game (while round wins < 4)
    // TODO: have everything separated into correct files/classes and not in main method
    // TODO: phase goal: be able to run with the command line and have the terminal read out who wins each match, round and then the game winner

    // TODO: goals after phase:
    //          build a UI,
    //          use Rest Template,
    //          hit a DB and record scores and winning records, and maybe which "hand" wins the most and which is most played?
    //          integrate SpringBoot,
    //          COMPLETED: allow for user to play computer,
    //          COMPLETED: User input needs to be converted to lowercase and then set to equal a lowercase choice,
    //          add in React,
    //          continue to refactor,

    public static void main(String[] args) {
        playOneMatch();

        }

    public static void playOneMatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player, please choice Rock, Paper or Scissors: ");
        String playerChoice = scanner.nextLine().toUpperCase();
        String computerChoice = "PAPER";
        // Print out choices
        System.out.println("Player has chosen " + playerChoice + " and Computer has chosen " + computerChoice + ".");

        // Determine who wins the match
        if (playerChoice.equals(computerChoice)) {
            System.out.println("Players Tied!");
        } else if (playerChoice.equals("ROCK") && computerChoice.equals("PAPER")) {
            System.out.println("Computer WINS with " + computerChoice);
        } else if (computerChoice.equals("ROCK") && playerChoice.equals("PAPER")) {
            System.out.println("Player WINS with " + playerChoice);
        } else if (playerChoice.equals("SCISSORS") && computerChoice.equals("PAPER")) {
            System.out.println("Player WINS with " + playerChoice);
        } else if (computerChoice.equals("SCISSORS") && playerChoice.equals("PAPER")) {
            System.out.println("Computer WINS with " + computerChoice);
        } else if (playerChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) {
            System.out.println("Player WINS with " + playerChoice);
        } else if (computerChoice.equals("ROCK") && playerChoice.equals("SCISSORS")) {
            System.out.println("Computer WINS with " + computerChoice);
        } else {
            System.out.println("Something broke in seeing who wins...");
        }

        //Play again?\
        System.out.println("Would you like to play another match? (y/n): ");
        String playAgainResp = scanner.nextLine();

        if (playAgainResp.toLowerCase().equals("y") || playAgainResp.toLowerCase().equals("yes")) {
            playOneMatch();
        } else {
            System.out.println("Game Over: Thanks for playing!");
        }
        scanner.close();
    }

}
