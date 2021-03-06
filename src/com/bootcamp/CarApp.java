package com.bootcamp;

public class CarApp {
    public static void main(String[] args) {
        Car porsche = new Car("Porsche", "red", true);
        Car jetta = new Car("Jetta", "blue", true);
        // create driver instance
        Driver dr1 = new Driver();
        dr1.setName("Bob");

        // mention driver two
        Driver dr2 = new Driver();
        dr2.setName("Alex");

        porsche.mentionDriver(dr1);
        jetta.mentionDriver(dr2);

        porsche.start();
        jetta.start();
        porsche.acceleration();
        jetta.acceleration();
        jetta.getEmissionTest();
        porsche.speed(50);
        porsche.stop();
        String str1 = porsche.getColor() + " " + porsche.getBrand();
        String str2 = jetta.getColor() + " " + jetta.getBrand();
        jetta.takeover(str2, str1);
    }
}
