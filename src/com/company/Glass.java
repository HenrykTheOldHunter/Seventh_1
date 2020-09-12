package com.company;

public class Glass extends Dish {

    public Glass(float weight, String form, String color){
        setWeight(weight);
        setForm(form);
        setColor(color);
    }

    @Override
    public void say() {
        System.out.println("Стакан\nВесом " + getWeight() + "\nФорма " + getForm() + "\nЦвет " + getColor() );
        System.out.println(getPure()?"Стака чистый":"Стакан грязный ");
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