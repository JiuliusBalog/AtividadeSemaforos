package view;
import controller.Porta;
import java.util.Random;

public class Main 
{
    public static void main(String[] args) 
  {
        Porta porta = new Porta();
        Random random = new Random();
        
        Runnable pessoa = ( ) -> 
        {
            String nome = "Pessoa " + Thread.currentThread().threadId();
            int velocidade = random.nextInt(3) + 4; // Velocidade entre 4 e 6 m/s
            int tempoCaminhada = (200 / velocidade) * 1000; // Tempo para percorrer 200m em ms
            
            System.out.println(nome + " começou a caminhar a " + velocidade + "m/s.");
            try 
            {
                Thread.sleep(tempoCaminhada);
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            
            porta.cruzarPorta(nome);
        };
        
        new Thread(pessoa).start();
        new Thread(pessoa).start();
        new Thread(pessoa).start();
        new Thread(pessoa).start();
    }
}