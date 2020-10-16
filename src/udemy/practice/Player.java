package udemy.practice;

public class Player {
    String playerName;
    String playerChoice;
    // work be cool to add something like and object that kept track of how many times each choice was used and/or which choice wins the most often

    int matchWins;
    int matchLoses;
    int roundWins;
    int roundLoses;
    int gameWins;
    int gameLoses;

    public String getPlayerName() {
        return this.playerName;
    }
    public String getPlayerChoice() {
        return this.playerChoice;
    }
    public void setPlayerName(String name) {
        this.playerName = name;
    }
    public void setPlayerChoice(String choice) {
        this.playerChoice = choice;
    }

}
