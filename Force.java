package demo.calculator;

public class Force {
    private static final double GRAVITY = 9.8;

    double slidingForce(double weight, double angle) {
        return weight * GRAVITY * Math.sin(Math.toRadians(angle));
    }

    double normalForce(double weight, double angle) {
        return weight * GRAVITY * Math.cos(Math.toRadians(angle));
    }
}
