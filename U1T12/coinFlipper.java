package U1T12;

public class coinFlipper {
    private coinFlipper() {}

    public String flip() {
        int flip = (int) (Math.random() * 2);
        if (flip == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }
    
    public double simulateFlips(int numberOfFlips) {
        int headsCount = 0;
        int tailsCount = 0;
        for (int i = 0; i < numberOfFlips; i++) {
            if (flip().equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        return (double) headsCount / numberOfFlips;
    }
}
