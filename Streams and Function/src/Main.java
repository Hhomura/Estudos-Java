import Utils.Functions;
import models.Usuarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /*STREAM
            Trabalho de métodos mais usados da API
         */

        List <String> nomes = List.of("Felipe", "Thiago", "Lucas", "Matheus", "Luiza", "Felipe", "Thiago");

        //Filter, Map -> só usando Stream

        Stream<String> stream = nomes.stream();
        //Filter
        List nomesFilter = stream
                .filter( s -> s.contains("a"))
                .collect(Collectors.toList());
        System.out.println(nomesFilter);

        //Count and Size
        System.out.println("Count: " + nomesFilter.stream().count());
        System.out.println("Size: " + nomesFilter.size());  // mais eficiente

        //Sorted
        Stream<String> streamSorted = nomes.stream();
        List<String> nomesOrganizados = streamSorted.sorted().collect(Collectors.toList());
        System.out.println(nomesOrganizados);

        //Map
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 34, 5, 6, 78, 100));
        ArrayList<Integer> numerosDuplos = numeros.stream()
                .map(x -> x * 2)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numerosDuplos);

        // Foreach
        //numeros.stream().forEach(System.out::println);
        //numeros.forEach(System.out::println); // mais eficiente

        //Distinct
        List<String> nomesDistinct = nomes.stream()
                .distinct() //distingue
                .sorted() //ordena
                .collect(Collectors.toList());
        System.out.println(nomesDistinct);
        System.out.println("Nomes não repetidos: " + nomesDistinct.size());
        System.out.println("Nomes originais mesmo com repetição: " + nomes.size());


        //Stream and Functions
        List<Usuarios> usuarios = new ArrayList<>(Arrays.asList(
                new Usuarios("Suzumiya Haruhi", "Haruhi@gmail.com", 100.0),
                new Usuarios("Arthuria", "saber@gmail.com", 0.0),
                new Usuarios("Lain", "lain@gmail.com.com", 11200.0),
                new Usuarios("Fate", "email@email.com", 1011.0),
                new Usuarios("Re-L", "rel@global.com", 300.0),
                new Usuarios("Madoka", "madoka@hotmail.com", 175.0),
                new Usuarios("Goku", "kakaroto@hotmail.com", 600.0)
        ));

        List<Usuarios> usuariosGmail = usuarios.stream()
                .filter(a -> a.getEmail().contains("gmail"))
                .collect(Collectors.toList());
        usuariosGmail.forEach(a -> System.out.println(a.getEmail()));

        List<Usuarios> usuariosNotGmail = usuarios.stream()
                .filter(a -> !a.getEmail().contains("gmail"))
                .collect(Collectors.toList());
        usuariosNotGmail.forEach(a -> System.out.println("No Gmail: " + a.getEmail()));

        List<String> ususariosOrdenados = usuarios.stream()
                .map(Usuarios::getNome)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ususariosOrdenados);

        List<String> usuariosComMaisDe500 = usuarios.stream()
                .filter( x -> x.getSaldo() >= 500)
                .map(Usuarios::getNome)
                .collect(Collectors.toList());
        System.out.println(usuariosComMaisDe500);

        List<Double> usuariosTotalSaldo = usuarios.stream()
                .map(Usuarios::getSaldo).reduce(Double::sum).stream().toList();
        System.out.println(usuariosTotalSaldo);

        //FUNCTIONS (Usados Apenas com MAP)
        List<String> ususariosOrdenadosF = usuarios.stream()
                .map(Functions.funtionNomes)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Function Nomes Ordenados: " + ususariosOrdenadosF);

        List<Double> usuariosTotalSaldoF = usuarios.stream()
                .map(Functions.funtionSaldos).reduce(Double::sum).stream().toList();
        System.out.println("Function Saldos Total: " + usuariosTotalSaldoF);

        List <Double> saldosDobradosF = usuarios.stream()
                .map(Functions.functionDoubleSaldo)
                .collect(Collectors.toList());
        System.out.println("Function Saldos Dobrados: " + saldosDobradosF);

    }
}