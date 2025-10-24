package week2;

import common.IBicycle;

public class Bicycle implements IBicycle {
    int speed = 0;
    int gear = 1;
    String color = "";

    Bicycle(String bikeColor) {
        this.color = bikeColor;
    }

    Bicycle() {

    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    int getSpeed() {
        return speed;
    }

    void lastState() {
        System.out.println("Speed: " + speed + " Gear: " + gear + " Color: " + color);
    }


}
