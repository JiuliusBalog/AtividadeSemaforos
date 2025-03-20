package controller;
import java.util.Random;

public class Porta 
{
    private final Object lock = new Object();

    public void cruzarPorta(String nome) 
    {
        synchronized (lock) 
        {
            System.out.println(nome + " chegou à porta e está atravessando...");
            try 
            {
                Thread.sleep(new Random().nextInt(1000) + 1000);
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println(nome + " atravessou a porta.");
        }
    }
}