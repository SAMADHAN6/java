
//BASE CLASS

class Animal {
    int legs;
    String diet;
    String sound;

    Animal(int legs, String diet, String sound) {
        this.legs = legs;
        this.diet = diet;
        this.sound = sound;
    }

    void show() {
        System.out.println("Sound : " + sound);
        System.out.println("Legs  : " + legs);
        System.out.println("Diet  : " + diet);
    }
}

//  SINGLE INHERITANCE 
class Dog extends Animal {
    Dog() {
        super(4, "Carnivore", "Bark");
    }
}

//  MULTILEVEL INHERITANCE 
class Puppy extends Dog {
    Puppy() {
        super();
        sound = "Small Bark";
    }
}

//  HIERARCHICAL INHERITANCE 
class Cow extends Animal {
    Cow() {
        super(4, "Herbivore", "Moo");
    }
}

//  MULTIPLE INHERITANCE 
interface Pet {
    String petType = "Domestic";
}

//  HYBRID INHERITANCE 
class Cat extends Animal implements Pet {
    Cat() {
        super(4, "Carnivore", "Meow");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {

        System.out.println("---- Single Inheritance ----");
        Dog d = new Dog();
        d.show();

        System.out.println("\n---- Multilevel Inheritance ----");
        Puppy p = new Puppy();
        p.show();

        System.out.println("\n---- Hierarchical Inheritance ----");
        Cow c = new Cow();
        c.show();

        System.out.println("\n---- Multiple + Hybrid Inheritance ----");
        Cat cat = new Cat();
        cat.show();
        System.out.println("Pet Type : " + Pet.petType);
    }
}