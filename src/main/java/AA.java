import com.sun.org.apache.xerces.internal.dom.AttrNSImpl;

import java.util.*;
public class AA {

    public static void main(String[] args) {


        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Dog());

        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());


        //
        //animals = Dog;
    }

}


class Animal{

}


class Dog extends Animal{

}
