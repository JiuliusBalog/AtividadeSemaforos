package controller;
import java.util.Random;

public class Banco 
{
    private final Object saqueLock = new Object();
    private final Object depositoLock = new Object();

    public void transacao(String tipo, String codigoConta, double saldo, double valor)
    {
        if (tipo.equals("Saque")) 
        {
            synchronized (saqueLock)
            {
                if (saldo >= valor) 
                {
                    saldo -= valor;
                    System.out.println("Conta " + codigoConta + ": Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
                } 
                else 
                {
                    System.out.println("Conta " + codigoConta + ": Saldo insuficiente para saque de R$" + valor);
                }
            }
        } 
        else 
        { // Depósito
            synchronized (depositoLock) 
            {
                saldo += valor;
                System.out.println("Conta " + codigoConta + ": Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
            }
        }
    }
}