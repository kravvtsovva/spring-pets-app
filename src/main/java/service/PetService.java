package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pets.Cat;
import pets.Dog;

@Service
public class PetService {

    private final Cat cat;
    private final Dog dog;

    @Autowired
    public PetService(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void play(){
        System.out.println("Кот и собака играют:");
        cat.sound();
        dog.sound();
    }
}
