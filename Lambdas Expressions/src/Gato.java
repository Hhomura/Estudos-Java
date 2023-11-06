public class Gato implements ILambda{

    private String nome;

    public Gato(String nome) {
        this.nome = nome;
    }


    @Override
    public void printMessage() {
        System.out.println("Opa");
    }
}
