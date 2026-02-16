import java.util.Scanner;

// Base class
class Animal {
    String name;
    int age;

    // 1. Default constructor
    Animal() {
        name = "Unknown";
        age = 0;
    }

    // 2. Parameterized constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. Copy constructor
    Animal(Animal a) {
        this.name = a.name;
        this.age = a.age;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Dog class
class Dog extends Animal {

    Dog() {
        super();
    }

    Dog(String name, int age) {
        super(name, age);
    }

    Dog(Dog d) {
        super(d);
    }

    // Polymorphism
    void sound() {
        System.out.println(name + " says: Woof Woof 🐶");
    }
}

// Cat class
class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    void sound() {
        System.out.println(name + " says: Meow Meow 🐱");
    }
}

// Main Application
public class AnimalApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Animal a = null;
        Dog lastDog = null;

        int choice;

        do {
            System.out.println("\n===== ANIMAL APPLICATION =====");
            System.out.println("1. Create Dog (Default Constructor)");
            System.out.println("2. Create Dog (Parameterized Constructor)");
            System.out.println("3. Copy Dog (Copy Constructor)");
            System.out.println("4. Create Cat");
            System.out.println("5. Show Sound (Polymorphism)");
            System.out.println("6. Display Animal Info");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    a = new Dog(); // default constructor
                    lastDog = (Dog) a;
                    System.out.println("Dog created using default constructor");
                    break;

                case 2:
                    System.out.print("Enter dog name: ");
                    String name = sc.next();
                    System.out.print("Enter dog age: ");
                    int age = sc.nextInt();

                    a = new Dog(name, age); // parameterized
                    lastDog = (Dog) a;
                    System.out.println("Dog created using parameterized constructor");
                    break;

                case 3:
                    if (lastDog != null) {
                        a = new Dog(lastDog); // copy constructor
                        System.out.println("Dog copied successfully");
                    } else {
                        System.out.println("Create a dog first to copy!");
                    }
                    break;

                case 4:
                    System.out.print("Enter cat name: ");
                    String cname = sc.next();
                    System.out.print("Enter cat age: ");
                    int cage = sc.nextInt();

                    a = new Cat(cname, cage);
                    System.out.println("Cat created");
                    break;

                case 5:
                    if (a != null) {
                        a.sound(); // runtime polymorphism
                    } else {
                        System.out.println("No animal created yet!");
                    }
                    break;

                case 6:
                    if (a != null) {
                        a.display();
                    } else {
                        System.out.println("No animal to display!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
