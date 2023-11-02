package threadExtends;

public class ThreadExtend extends Thread{

    int control = 0;
    private String nome;

    public ThreadExtend(String nome){
        this.nome = nome;
    }
    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            control += i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i+" - Thread Nome: " + nome + " Valor: " + control);
        }
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
