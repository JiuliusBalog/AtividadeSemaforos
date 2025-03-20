package view;
import controller.Banco;
import java.util.Random;

public class Main 
{
    public static void main(String[] args) 
    {
        Banco banco = new Banco();
        Random random = new Random();

        Runnable transacao = () -> 
        {
            String codigoConta = "C" + (random.nextInt(5) + 1); 
            double saldo = 1000.0; 
            double valor = random.nextDouble() * 500; 
            String tipo = random.nextBoolean() ? "Saque" : "Depósito";
            
            banco.transacao(tipo, codigoConta, saldo, valor);
        };

        for (int i = 0; i < 20; i++) 
        {
            new Thread(transacao).start();
        }
    }
}