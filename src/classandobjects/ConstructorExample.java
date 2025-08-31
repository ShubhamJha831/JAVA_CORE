package classandobjects;

public class ConstructorExample {
    // Example on Constructors
    class Student {
        String name;
        int age;

        // 1. No-argument Constructor
        Student() {
            name = "Unknown";
            age = 0;
            System.out.println("No-argument constructor called.");
        }

        // 2. Parameterized Constructor
        Student(String n, int a) {
            name = n;
            age = a;
            System.out.println("Parameterized constructor called.");
        }

        // Method to display student details
        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    // Main Class
    public class ConstructorExample {
        public static void main(String[] args) {
            // Calls no-argument constructor
            Student s1 = new Student();
            s1.display();

            // Calls parameterized constructor
            Student s2 = new Student("Shubham", 21);
            s2.display();
        }
    }

}
