package models;

public class Gato extends Animal{

    public Gato(String nome){
        super(nome);
    }

    @Override
    public void som() {
        System.out.println("Miau");
    }

    @Override
    void print() {
        super.print();
    }

}
