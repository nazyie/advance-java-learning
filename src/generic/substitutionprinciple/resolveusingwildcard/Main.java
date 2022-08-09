package generic.substitutionprinciple.resolveusingwildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Substitution principle allow to assign the variable of the given type to sub-types
     * <p>But not a list</p>
     * @param args
     */
    public static void main(String[] args) {

        // main object
        Dog dog = new Dog();
        Animal animal = new Animal();
        Husky husky = new Husky();

        // substitution of string cause it part of animal
        createAnimal(dog);
        createAnimal(animal);
        createAnimal(husky);

        // substitution of list of the animal
        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animalList.add(dog);
        animalList.add(animal);

        watchAnimals(animalList);

        List<Dog> dogList = new ArrayList<>();
//        dogList.add(animal); // DOES NOT APPLY
        dogList.add(dog);
        dogList.add(husky);

//        watchAnimals(dogList); // DOES NOT APPLY
    }

    public static void createAnimal(Animal animal) {
        System.out.println(animal);
    }

    public static void watchAnimals(List<Animal> animalList) {
        for(Animal animal: animalList) {
            System.out.println(animal);
        }
    }


}
