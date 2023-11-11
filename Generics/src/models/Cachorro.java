package models;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void som() {
        System.out.println("Au Au");
    }

    @Override
    void print() {
        super.print();
    }

}
