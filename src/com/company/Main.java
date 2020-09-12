package com.company;

public class Main {

    public static void main(String[] args) {
        Glass glass = new Glass (1.0f, "Шестиугольная", "светло-коралловый цвет ночного краба под лунным рифом");
        Plate plate = new Plate(0.5f, "круга", "цвет морской волны");
        Cup cup = new Cup(0.2f, "чашки", "серо-буро-малиновый в крапинку");

        glass.say();
        plate.say();
        cup.say();
    }
}