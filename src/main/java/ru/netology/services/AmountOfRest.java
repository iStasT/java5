package ru.netology.services;

public class AmountOfRest {

    public int calculate(int income, int expenses, int threshold) {
        int counter = 0;
        int money = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // rest
                money -= expenses;
                money /= 3;
                counter++;
            } else {
                // work
                money += income - expenses;
            }
        }
        return counter;
    }
}