package week4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.plaka = 06;
        car1.hasDamage = false;
        car1.gearType = 'A';
        car1.model = "Toyota Yaris";
        car1.avarageFuelUsage = 7.123456789012345678;

        char var1 = 'a';
        char var2 = 'b';
        int var3 = 1;
        double var4 = 1.8;

        int var5 = (int) (var1 + var2 + var3 + var4);


        System.out.println(var5);

        int [] arr = new int[var3];
        arr[0] = 1;

        var3 = 2;
        arr[1] = 2;
        System.out.println(arr[1]);

    }


}
