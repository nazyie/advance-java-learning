package generic.substitutionprinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Wildcard is an unknown type and allow the flexibility when writing methods
     * <p>But not a list</p>
     * @param args
     */
    public static void main(String[] args) {

        // main object
        Dog dog = new Dog();
        Animal animal = new Animal();
        Husky husky = new Husky();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animalList.add(dog);
        animalList.add(animal);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog);
        dogList.add(husky);

        // wildcard for sub class want to print the list
        watchAnimals(dogList);

        System.out.println();

        // wildcard for main class want to print the list
        watchDogs(animalList);
    }

    public static void createAnimal(Animal animal) {
        System.out.println(animal);
    }

    /**
     * Wild card can apply to make it more flexibility
     * <p>Apply the wildcard to allow the main type to being assign to main type</p>
     * @param animalList
     */
    public static void watchAnimals(List<? extends Animal> animalList) {
        for(int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).toString());
        }
    }

    /**
     * Wild card can apply to make it more flexibility
     * <p>Apply the wild card to allow the main type to being assign to the sub-type</p>
     * @param dogList
     */
    public static void watchDogs(List<? super Dog> dogList) {
        for(int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i).toString());
        }
    }


}
