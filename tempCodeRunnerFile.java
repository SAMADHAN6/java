
//  BASE CLASS 
class Animal {
    int numberOfLegs;
    String dietType;

    Animal(int legs, String diet) {
        numberOfLegs = legs;
        dietType = diet;
    }

    void eat() {
        System.out.println("Animal eats food");
    }

    void displayInfo() {
        System.out.println("Number of legs: " + numberOfLegs);
        System.out.println("Diet type: " + dietType);
    }
}

//  SINGLE INHERITANCE 
class Dog extends Animal {

    Dog() {
        super(4, "Carnivore");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

//  MULTILEVEL INHERITANCE
class Mammal extends Animal {

    Mammal(int legs, String diet) {
        super(legs, diet);
    }

    void walk() {
        System.out.println("Mammal walks");
    }
}

class Cat extends Mammal {

    Cat() {
        super(4, "Carnivore");
    }

    void meow() {
        System.out.println("Cat meows");
    }
}

//  HIERARCHICAL INHERITANCE 
class Cow extends Animal {

    Cow() {
        super(4, "Herbivore");
    }

    void moo() {
        System.out.println("Cow moos");
    }
}

//  MULTIPLE INHERITANCE 

interface Pet {
    void friendly();
}

//  HYBRID INHERITANCE 
class Puppy extends Dog implements Pet {

    public void friendly() {
        System.out.println("Puppy is friendly");
    }
}


public class AnimalInheritance {
    public static void main(String[] args) {

        System.out.println("---- Single Inheritance ----");
        Dog d = new Dog();
        d.displayInfo();
        d.bark();

        System.out.println("\n---- Multilevel Inheritance ----");
        Cat c = new Cat();
        c.displayInfo();
        c.walk();
        c.meow();

        System.out.println("\n---- Hierarchical Inheritance ----");
        Cow cow = new Cow();
        cow.displayInfo();
        cow.moo();

        System.out.println("\n---- Multiple + Hybrid Inheritance ----");
        Puppy p = new Puppy();
        p.displayInfo();
        p.bark();
        p.friendly();
    }
}
