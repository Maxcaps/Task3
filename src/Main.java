public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addBall(new Ball("blue", 1.5));
        basket.addBall(new Ball("red", 1.2));
        basket.addBall(new Ball("blue", 0.8));
        basket.addBall(new Ball("greenPoison", 0.5));
        basket.addBall(new Ball("blue", 1.0));

        // Вывод общего веса мячей в корзине
        System.out.println("Total weight of balls in the basket: " + basket.getTotalWeight());

        // Вывод количества синих мячей
        System.out.println("Number of blue balls in the basket: " + basket.countBallsByColor("blue"));
    }
}
