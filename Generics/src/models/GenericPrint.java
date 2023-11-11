package models;

public class GenericPrint <T>{

    T a;

    public  GenericPrint(T a){
        this.a = a;
    }

    public void print(){
        System.out.println(a);
    }

}
