import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> basket = new ArrayList<>();

    public void addBall(Ball ball) {
        basket.add(ball);
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Ball ball : basket) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    public int countBallsByColor(String color) {
        int count = 0;
        for (Ball ball : basket) {
            if (ball.getColor().equalsIgnoreCase(color)) {
                count++;
            }
        }
        return count;
    }
}