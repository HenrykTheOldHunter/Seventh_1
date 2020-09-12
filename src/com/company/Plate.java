package com.company;

public class Plate extends Dish {

    public Plate(float weight, String form, String color){
        setWeight(weight);
        setForm(form);
        setColor(color);
    }

    @Override
    public void say() {
        System.out.println("Тарелка\nВесит " + getWeight() + "\nИмеет форму " + getForm() + "\nЦвет тарелки " + getColor());
        System.out.println(getPure()?"Тарелка чистая":"Тарелка грязная");
    }

    @Override
    public void wash() {
        setPure(true);
        System.out.println("Тарелка помыта!");
    }

    @Override
    public void dirty() {
        setPure(false);
        System.out.println("Вы запачкали тарелку");
    }
}