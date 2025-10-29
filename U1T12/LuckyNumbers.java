package U1T12;

public class LuckyNumbers {
  /* No instance variables */

  /* "empty" constructor with no parameters */
  public LuckyNumbers() {
  }

  public int randomIntegerBetween(int min, int max) {
    int randomNum = (int) (Math.random() * (max - min + 1)) + min;
    return randomNum;
  }

  public String getLuckyNumbers() {
    int luckyBall1 = randomIntegerBetween(1, 65);
    int luckyBall2 = randomIntegerBetween(1, 65);
    int luckyBall3 = randomIntegerBetween(1, 65);
    int luckyBall4 = randomIntegerBetween(1, 65);
    int luckyBall5 = randomIntegerBetween(1, 65);
    int superBall = randomIntegerBetween(1, 30);
    String output = ("your lucky balls are " + luckyBall1 + ", " + luckyBall2 + ", " + luckyBall3 + ", " + luckyBall4
        + ", " + luckyBall5 + "super ball is " + superBall);
    return output;
  }

}
