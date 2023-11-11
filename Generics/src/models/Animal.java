package models;

public class Animal {
    String nome;

    public Animal(String nome){
        this.nome = nome;
    }
    public void som(){
        System.out.println("Fazendo Som");
    }

    void print(){
        System.out.println(nome);
    }

}
