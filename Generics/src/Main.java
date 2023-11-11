import models.Cachorro;
import models.Gato;
import models.GenericAnimal;
import models.GenericPrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Usado quando Classes ou partes do código possuem repetições de estrutura
        Normalmente usa-se T como abreviação para "Type", porém você pode usar o que quiser desde que
        você e seus companheiros entendam. Por boas práticas, mantenha o T e outras consoantes Maiúsculas.
        T consegue usar "extends"
         */

        GenericAnimal<Gato> gatochan = new GenericAnimal<Gato>(new Gato("Senhor Gato"));
        gatochan.print();
        gatochan.som();

        GenericAnimal<Cachorro> cachorro = new GenericAnimal<>(new Cachorro("Senhor Dog"));
        cachorro.som();
        cachorro.print();


        GenericPrint<Integer> a = new GenericPrint<>(1298);
        GenericPrint<String> nome = new GenericPrint<>("Madoka");

        a.print();
        nome.print();

        GenericTwoTypes<Integer, String> ab = new GenericTwoTypes<>(19, "Felipe Santos Ramos");
        ab.print();

        List lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5 ));
        List lista2 = List.of("Nome 1", "Nome 2", "Nome 3", "Nome 4");

        printList(lista1);
        System.out.println();
        printList(lista2);
        System.out.println();
        retornaGenreic("Felipe Ramos", 20);

    }

    public static <T, V> T retornaGenreic(T a, V b){
        System.out.println(a + ", " + b);
        return a;
    }

    public static void printList(List<?> list){
        list.forEach(a -> System.out.print(a + ", "));
    }
    public static class GenericTwoTypes <T, V>{
        T a;
        V y;

        public GenericTwoTypes(T a, V y){
            this.a = a;
            this.y = y;
        }

        public void print(){
            System.out.println(a + " " + y);
        }
    }
}

