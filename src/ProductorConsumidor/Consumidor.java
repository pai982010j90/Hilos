package ProductorConsumidor;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nanohp
 */
public class Consumidor implements Runnable{
        private SyncStack laPila;
    private int num;
    private static int counter = 1;
    
    public Consumidor(SyncStack s){
        laPila = s;
        num = counter--;
    }
    

    @Override
    public void run() {
        char c;
        
        for (int i = 0; i < 200; i++) {
            c = laPila.pop();
            System.out.println("Consumidor "+num+":"+c);
            try{
                Thread.sleep((int)(Math.random() * 300));
            }catch(InterruptedException e){
                System.err.println("InterruptedException");
            }
        }
    }
}
