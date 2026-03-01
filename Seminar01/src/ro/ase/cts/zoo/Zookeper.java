package ro.ase.cts.zoo;

import ro.ase.cts.animal.Animal;

import java.util.List;

public class Zookeper {
    private String name;

    public Zookeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        animal.eat(name);
    }
}
