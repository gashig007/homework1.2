package com.company;

import java.util.Random;

public class Main {

    public static String option = "Можно идти гулять";
    public static String option1 = "Оставайтесь дома";

    public static void main(String[] args) {
        System.out.println(concat(20, 54));
        System.out.println(concat(3, 33));
        System.out.println(concat(40, 5));
        System.out.println(concat(70, -6));
        System.out.println(concat(54, 53));

        System.out.println(generateRandomAge());
    }

    public static String concat(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return option;
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return option;
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return option;
        } else {
            return option1;
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int number = random.nextInt(50);
        return number;
    }

}
