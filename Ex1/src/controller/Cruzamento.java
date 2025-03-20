package controller;

public class Cruzamento {
    private final Object lock = new Object();

    public void entrarCruzamento(String sentido, long id) 
    {
        synchronized (lock) 
        {
            System.out.println("Carro " + id + " passando pelo cruzamento no sentido: " + sentido);
            try 
            {
                Thread.sleep(1000); /
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println("Carro " + id + " saiu do cruzamento.");
        }
    }
}
