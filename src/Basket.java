import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> basket = new ArrayList<>();

    public void addBall(Ball ball) {
        if (ball == null) {
            throw new IllegalArgumentException("Ball cannot be null");
        }
        basket.add(ball);
    }

    public void addBalls(List<Ball> balls) {
        if (balls == null) {
            throw new IllegalArgumentException("List of balls cannot be null");
        }
        for (Ball ball : balls) {
            if (ball == null) {
                throw new IllegalArgumentException("Ball in the list cannot be null");
            }
        }
        basket.addAll(balls);
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Ball ball : basket) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    public int countBallsByColor(String color) {
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        int count = 0;
        for (Ball ball : basket) {
            if (ball.getColor().equalsIgnoreCase(color)) {
                count++;
            }
        }
        return count;
    }
}
