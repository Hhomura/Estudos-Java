import threadExtends.ThreadExtend;
import threadInterface.ThreadInterface;

public class Main {
    public static void main(String[] args) {

        /*
        Threads conseguem executar em paralelo sem interferir no decorrer das próximas linhas de programação.
        Você consegue passar valores por parametros e executar os mesmos dentro do método "run()" de cada classe.

        Usando classe que Extends de "Thread"

         */
        ThreadExtend t1 = new ThreadExtend("Madoka");
        ThreadExtend t2 = new ThreadExtend("Homura");
        ThreadExtend t3 = new ThreadExtend("Mami Tomoe");
        t1.start();
        t2.start();
        t3.start();

        try{
            Thread.sleep(2000);
        }
        catch (Exception e){

        }
        System.out.println("Parou");
        t1.interrupt();

        /*
        Quando se usa implements Runnable, você tem a liberdade de poder implementar outras interfaces e extender uma clsse que
        poderá ser mais importante em sua classe.
        Após criar um obj de uma classe que implementou Runnable, você passa a mesma por parametro em o=um objeto Thread e depois
        utiliza do método "start()"

        Usando Implements "Runnable"

         */


        ThreadInterface tx = new ThreadInterface("Iroha Implements");
        ThreadInterface ty = new ThreadInterface("Yachio Implements");
        ThreadInterface ta = new ThreadInterface("Alina Implements");

        Thread irohaThread = new Thread(tx);
        Thread yachioThread = new Thread(ty);
        Thread alinaThread = new Thread(ta);
        irohaThread.start();
        yachioThread.start();

        try{
            Thread.sleep(2000);
        }
        catch (Exception e){

        }
        alinaThread.start();

    }


}