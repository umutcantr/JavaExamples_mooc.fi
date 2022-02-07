/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biggestpetshop;

/**
 *
 * @author umut
 */
public class Person {

    private String name;
    private Pet pet;                                                             // create Pet class object

    public Person(String name, Pet pet) {                                        // constructer with name and pet parameter.
        this.name = name;
        this.pet = pet;
    }

    public Person(String name) {                                                 // constructer with name parameter.
        this(name, new Pet("Toothless", "dragon"));
    }

    public Person() {                                                            // constructer with no parameter.
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    @Override
    public String toString() {
        return this.name + ", " + "has a friend called " + pet.getName() + " (" +
                pet.getBreed() + ")";
    }

}
