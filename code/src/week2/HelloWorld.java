package week2;

public class HelloWorld {
    // In Java, the main method is required to run your application
    // The main method is the starting point of the program
    // The signature of the main method is fixed and should not be changed
    // public: access modifier, indicates that the method is accessible from anywhere
    // static: indicates that the method belongs to the class and can be called without creating an object
    // void: indicates that the method does not return any value
    // main: the name of the method
    // String[] args: an array parameter that holds command line arguments
    // args allows the program to receive parameters from outside when it is run
    // for example: java week2.HelloWorld arg1 arg2 arg3
    // The args array takes the values [“arg1”, ‘arg2’, “arg3”]
    // The main method contains the code to be executed by the program
    // In this example, “Hello World” is printed, followed by the arguments one by one
    // This demonstrates how command line arguments are used
    // To run the program: Enter the command: java week2.HelloWorld arg1 arg2 arg3

    // javac week2/HelloWorld.java
    // java week2.HelloWorld
    public static void main(String[] args) {
        System.out.println("Hello World");
        for (String arg : args) {
            System.out.println("Argument: " + arg);
        }
    }
}
