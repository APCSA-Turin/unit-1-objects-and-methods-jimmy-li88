package U1T8Lab2_ModifyingObjectState;


public class Game {
    private String gameName;
    private int players;
    private int score;
   
    public Game(String gameName, int players) {
    this.gameName = gameName;
    this.players = players;
    this.score = 0;
    }


    public String getGameName() {
        return gameName;
    }
    public int getPlayers() {
        return players;
    }
    public int getScore() {
        return score;
    }
    public void addPlayer() {
        players++;
    }
    public void increaseScore(int increase) {
        score += increase;
    }
    public double averageScorePerPlayer() {
        double average = (double) score / players;
        return average;
    }
    public boolean isGameOver() {
        if (score > 9) {
            return true;
        } else {
            return false;
        }
    }
}
lic void addPlayer() {
                                                                                                