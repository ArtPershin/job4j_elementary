package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }
    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }
    public static float EuroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }
    public static void main(String[] args) {
        float ruble = Converter.EuroToRuble(1);
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140) ;
        System.out.println("1 euro are " + ruble + " ruble.");
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 140;
        expected = 2.3333333F;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.3333333. Test result : " + passed);
        in =  1;
        expected = 70;
        out = Converter.EuroToRuble(in);
        passed = expected == out;
        System.out.println("1 euro are 70. Test result : " + passed);
    }
}
