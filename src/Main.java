import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball("Red", 1.5);
        Ball ball2 = new Ball("Blue", 2.0);
        Ball ball3 = new Ball("Red", 1.8);

        Basket basket = new Basket();
        basket.addBall(ball1);
        basket.addBalls(Arrays.asList(ball2, ball3));

        System.out.println("Total weight: " + basket.getTotalWeight());
        System.out.println("Number of red balls: " + basket.countBallsByColor("Red"));
    }
}
