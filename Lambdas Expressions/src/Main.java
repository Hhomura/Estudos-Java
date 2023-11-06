public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Goku");
        //gato.printMessage();
        printAble(gato);

        // Envio de Comandos e valores válidos pois, o Java identificar o uso de apenas um método.
        // Quando se usa dois metodos na interface ocorre erro de sobrecarga, não sendo possível
        // o uso de lambdas functions

        printAble(() -> System.out.println("Nine Lives"));
        ILambda message = () -> System.out.println("aias");
        printAble(message);

        //Com Parametro
        printAbleParam(x -> System.out.println("ZE "  + x)); // x = "Com Parametro", meio que um parametro ja pre programado

        //Com Retorno
        ILambdaWithReturn a = x -> "retorno " + x;
        String messageFinal = printWithReturn(a);
        System.out.println(messageFinal);
    }

     static void printAble(ILambda a){
        a.printMessage();
    }

    static void printAbleParam(ILambdaWithParameter a){
        a.printWithParam("Com Parametro");
    }

    static String printWithReturn(ILambdaWithReturn iLambdaWithReturn){
        return iLambdaWithReturn.printReturn("Retornado");
    }
}