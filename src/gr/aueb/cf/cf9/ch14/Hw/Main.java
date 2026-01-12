package gr.aueb.cf.cf9.ch14.Hw;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("King", 5);
        Animal dog = new Dog("Rex", 5);
        Animal cat = new Cat("Meow", 3);

        doSpeak(animal);
        doSpeak(dog);
        doSpeak(cat);

        System.out.println(animal);
        System.out.println(cat);
        System.out.println(dog);

        animal.speak();
        cat.speak();
        dog.speak();

    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
