package com.haozj;

import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Animal> animals = new ArrayList<>();
    void action(Person person){
        for (Animal animal : animals) {
            animal.accept(person);
        }
    }

    /**
     * 添加动物
     * @param animal
     */
    void add(Animal animal){
        animals.add(animal);
    }
}
