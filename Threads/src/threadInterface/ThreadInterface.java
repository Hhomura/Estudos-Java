package threadInterface;

public class ThreadInterface implements Runnable{

    private String nome;

    public ThreadInterface(String nome){
        this.nome = nome;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 5; i++){
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Erro");
            }
            System.out.println("Nome: " + nome + " Valor: " + i);
        }
    }

}
