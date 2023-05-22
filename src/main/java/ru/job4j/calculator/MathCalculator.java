package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return MathFunction.diff(first, second)
        + MathFunction.div(first, second);
    }

    public static double plusAll(double first, double second) {
        return MathFunction.diff(first, second)
                + MathFunction.div(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.sum(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + diffAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + plusAll(10, 20));
    }
}
