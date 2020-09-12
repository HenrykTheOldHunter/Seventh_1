package com.company;

public abstract class Dish {
    private boolean pure = false;
    private float weight = 0.0f;
    private String form = "default";
    private String color = "default";

    public void setPure(boolean pure) {this.pure = pure;}
    public boolean getPure() {return pure;}

    public void setWeight(float weight) {this.weight = weight; }
    public float getWeight() {return weight;}

    public void setForm(String form) {this.form = form;}
    public String getForm() {return form;}

    public void setColor(String color) {this.color = color;}
    public String getColor() {return color;}


    public abstract void say();
    public abstract void wash();
    public abstract void dirty();

}