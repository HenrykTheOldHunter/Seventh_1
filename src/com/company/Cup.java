package com.company;

public class Cup extends Dish {

    public Cup(float weight, String form, String color){
        setWeight(weight);
        setForm(form);
        setColor(color);
    }

    @Override
    public void say() {
        System.out.println("Кружка\nВесом " + getWeight() + "\nФорма " + getForm() + "\nЦвет " + getColor() );
        System.out.println(getPure()?"Кружка чистая":"Кружка грязная");
    }

    @Override
    public void wash() {
        setPure(true);
        System.out.println("Кружка помыта!");
    }

    @Override
    public void dirty() {
        setPure(false);
        System.out.println("Вы запачкали кружку");
    }
}
