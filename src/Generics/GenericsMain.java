package Generics;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("Hey", "Hi");
        Pair<Double, Double> pair1 = new Pair<>(11.2,11.4);
        Pair<Integer, String> pair2 = new Pair<>(2 , "name");
        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal();
        animal.setName("Tiger");
        animal.setAge(2);

        Animal animal1 = new Animal();
        animal1.setAge(3);
        animal1.setName("Lion");

        Animal animal2 = new Animal();
        animal2.setName("Elephant");
        animal2.setAge(4);

        Dog dog = new Dog();
        dog.setName("Labrador");
        dog.setAge(5);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal);
        animals.add(dog);

        List<Dog> dogs = new ArrayList<>();

        Dog dog1 = new Dog();
        dog1.setName("German");
        dog1.setAge(6);
        Dog dog2 = new Dog();
        dog2.setName("Golden Retriever");
        dog2.setAge(7);
        Dog dog3 = new Dog();
        dog3.setName("Shi Tzu");
        dog3.setAge(8);

        dogs.add(dog1);
        dogs.add(dog3);
        dogs.add(dog2);

        doSomething(animals);
        doSomething(dogs);
    }

    public static void doSomething(List<? extends Animal> animals){
        for(Animal animal: animals){
            System.out.println(animal.getName());
            System.out.println(animal.getAge());
        }
    }
}
