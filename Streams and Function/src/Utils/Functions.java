package Utils;

import models.Usuarios;

import java.util.function.Function;

public class Functions {

    public static Function<Usuarios, String> funtionNomes = Usuarios::getNome;

    public static Function<Usuarios, Double> funtionSaldos = Usuarios::getSaldo;

    public static Function<Usuarios, Double> functionDoubleSaldo = a -> a.getSaldo() * 2;

}
