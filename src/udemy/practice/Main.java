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

    // TODO: move the name question and getter from the match level so that it doesnt ask everytime a new game is triggered, just the once at the very beginning

    public static void main(String[] args) {
        playOneMatch();

        }

    public static void playOneMatch() {
        Player playerOne = new Player();
        Player compPlayer = new Player();
        compPlayer.setPlayerName("Computer");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Please enter your name below: ");
        String nameInput = scanner.nextLine();
        playerOne.setPlayerName(nameInput);

        // plays a round; should make this it's own method that gets called every time a round is needed

        playRound();

        //Play again?
//        System.out.println("Would you like to play another match? (y/n): ");
//        String playAgainResp = scanner.nextLine();
//
//        if (playAgainResp.toLowerCase().equals("y") || playAgainResp.toLowerCase().equals("yes")) {
//            playOneMatch();
//        } else {
//            System.out.println("Game Over: Thanks for playing!");
//        }
        scanner.close();
    }

    public static void playRound(playerOne, compPlayer) {
        while(playerOne.matchWins < 3 && compPlayer.matchWins < 3) {
            System.out.println(playerOne.getPlayerName() + ", please choice Rock, Paper or Scissors: ");
            String playersChoice = scanner.nextLine().toUpperCase();
            playerOne.setPlayerChoice(playersChoice);
            // TODO: randomize the computer's choice
            compPlayer.setPlayerChoice("PAPER");
            // Print out choices
            System.out.println("Player has chosen " + playerOne.playerChoice + " and Computer has chosen " + compPlayer.getPlayerChoice() + ".");

            // Determine who wins the match
            if (playerOne.playerChoice.equals(compPlayer.getPlayerChoice())) {
                System.out.println("Players Tied!");
            } else if (playerOne.playerChoice.equals("ROCK") && compPlayer.getPlayerChoice().equals("PAPER")) {
                compPlayer.matchWins++;
                System.out.println("Computer WINS with " + compPlayer.getPlayerChoice());
            } else if (compPlayer.getPlayerChoice().equals("ROCK") && playerOne.playerChoice.equals("PAPER")) {
                System.out.println(playerOne.getPlayerName() + " WINS with " + playerOne.playerChoice);
            } else if (playerOne.playerChoice.equals("SCISSORS") && compPlayer.getPlayerChoice().equals("PAPER")) {
                System.out.println(playerOne.getPlayerName() + " WINS with " + playerOne.playerChoice);
            } else if (compPlayer.getPlayerChoice().equals("SCISSORS") && playerOne.playerChoice.equals("PAPER")) {
                System.out.println("Computer WINS with " + compPlayer.getPlayerChoice());
            } else if (playerOne.playerChoice.equals("ROCK") && compPlayer.getPlayerChoice().equals("SCISSORS")) {
                System.out.println(playerOne.getPlayerName() + " WINS with " + playerOne.playerChoice);
            } else if (compPlayer.getPlayerChoice().equals("ROCK") && playerOne.playerChoice.equals("SCISSORS")) {
                System.out.println("Computer WINS with " + compPlayer.getPlayerChoice());
            } else {
                System.out.println("Something broke in seeing who wins...");
            }

            System.out.println(playerOne.playerName + "'s score: " + playerOne.matchWins);
            System.out.println(compPlayer.playerName + "'s score: " + compPlayer.matchWins);

            if(playerOne.matchWins == 3) {
                playerOne.gameWins++;
                System.out.println(playerOne.playerName + " has won the round!");
            } else if (compPlayer.matchWins == 3) {
                compPlayer.gameWins++;
                System.out.println(compPlayer.playerName + " has won the round!");
            }
        }
    };


}
