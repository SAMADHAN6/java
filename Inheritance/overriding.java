//BASE

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

class Dog extends Animal {
    Dog() {
        super(4, "Carnivore", "Bark");
    }

    @Override
    void show() {
        System.out.println("Dog Details:");
        System.out.println("Sound : " + sound);
        System.out.println("Legs  : " + legs);
        System.out.println("Diet  : " + diet);
    }
}

class Puppy extends Dog {
    Puppy() {
        super();
        sound = "Small Bark";
    }
}

class Cow extends Animal {
    Cow() {
        super(4, "Herbivore", "Moo");
    }

    @Override
    void show() {
        System.out.println("Cow Details:");
        System.out.println("Sound : " + sound);
        System.out.println("Legs  : " + legs);
        System.out.println("Diet  : " + diet);
    }
}

interface Pet {
    String petType = "Domestic";
}

class Cat extends Animal implements Pet {
    Cat() {
        super(4, "Carnivore", "Meow");
    }

    @Override
    void show() {
        System.out.println("Cat Details:");
        System.out.println("Sound : " + sound);
        System.out.println("Legs  : " + legs);
        System.out.println("Diet  : " + diet);
        System.out.println("Pet Type : " + petType);
    }
}

public class overriding {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.show();

        a = new Puppy();
        a.show();

        a = new Cow();
        a.show();

        a = new Cat();
        a.show();
    }
}
