package week2;

public class BicycleDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Bicycle bicycle = new Bicycle("Red");
        bicycle.speedUp(10);
        bicycle.applyBrakes(5);
        bicycle.lastState();

        for (String arg : args) {
            System.out.println("Argument: " + arg);
        }

        MountainBike mountainBike = new MountainBike();
        mountainBike.chSuspension(2);
        mountainBike.speedUp(30);
        mountainBike.applyBrakes(5);
        mountainBike.changeGear(2);
        mountainBike.toString();
    }
}
