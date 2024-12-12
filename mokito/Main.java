package demo.calculator;

import demo.calculator.Force;

public class Main {
    public static void main(String[] args) {
        Force force = new Force();
        double weight = 5; // 5kg
        double angle = 37; // 37 度

        // 使用 mock 值
        double sinValue = 0.6;
        double cosValue = 0.7;

        // 計算法向力
        double normalForce = weight * 9.8 * cosValue;
        System.out.println("法向力: " + normalForce + " N");

        // 計算滑動分力
        double slidingForce = weight * 9.8 * sinValue;
        System.out.println("滑動分力: " + slidingForce + " N");
    }
}
