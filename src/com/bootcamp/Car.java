package com.bootcamp;

public class Car extends Vehicle {
    private String brand;
    private String color;
    private boolean emissionTest;

    public Car() {
    }

    public Car(String brand, String color, boolean emissionTest) {
        this.brand = brand;
        this.color = color;
        this.emissionTest = emissionTest;
    }

    public void acceleration(){
        System.out.println("The " + getColor() + " " + getBrand() + " is accelerating.");
    }

    public void speed(int mph){
        System.out.println("The " + getColor() + " " + getBrand() + " is going " + mph + " mph");
    }

    public void start() {
        System.out.println("The " + getColor() + " " + getBrand() + " is starting");
    }
    public void stop() {
        System.out.println("The " + getColor() + " " + getBrand() + " is stopped");
    }

    public void takeover(String str1, String str2){         // str1 is "blue Jetta" & str2 is "red Porsche"
        System.out.println("The " + str1 + " just passed the " + str2);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mentionDriver(Driver dr){
        System.out.println("The " + getColor() + " " + getBrand() + " " + "is being driven by " + dr.getName());
    }
    public void getEmissionTest() {
        if(emissionTest){
            System.out.println("The " + getColor() + " " + getBrand() + " has stopped to have its emissions checked");
            System.out.println("The " + getColor() + " " + getBrand() + " passes its emission test");

        }

    }

    public void setEmission(boolean emissionTest) {
        this.emissionTest = emissionTest;
    }
}
