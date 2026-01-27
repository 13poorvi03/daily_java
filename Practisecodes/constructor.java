package Practisecodes;

public class constructor {
    // Instance variables
    String name;
    int age;

    // Constructor (same name as class, no return type)
    public constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display values
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to test
    public static void main(String[] args) {
        // Creating object using constructor
        constructor obj1 = new constructor("Poorvi", 20);
        constructor obj2 = new constructor("Rahul", 22);

        obj1.display();
        obj2.display();
    }
}