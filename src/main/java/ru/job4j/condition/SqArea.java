package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        return i * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(8, 4);
        System.out.println(" p = 8, k = 4, s = 1, real =  " + result1);
    }
}
