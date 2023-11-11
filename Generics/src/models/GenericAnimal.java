package models;

public class GenericAnimal <T extends Animal> {

    T animal;

    public GenericAnimal(T animal){
        this.animal = animal;
    }

    public void print(){
        animal.print();
    }

    public void som(){
        animal.som();
    }
}
