package view;
import controller.Cruzamento;

public class Main 
{
    public static void main(String[] args) 
    {
        Cruzamento cruzamento = new Cruzamento();
        
        Thread carro1 = new Thread(() -> cruzamento.entrarCruzamento("Norte-Sul", Thread.currentThread().threadId()));
        Thread carro2 = new Thread(() -> cruzamento.entrarCruzamento("Leste-Oeste", Thread.currentThread().threadId()));
        Thread carro3 = new Thread(() -> cruzamento.entrarCruzamento("Sul-Norte", Thread.currentThread().threadId()));
        Thread carro4 = new Thread(() -> cruzamento.entrarCruzamento("Oeste-Leste", Thread.currentThread().threadId()));
        
        carro1.start();
        carro2.start();
        carro3.start();
        carro4.start();
    }
}
