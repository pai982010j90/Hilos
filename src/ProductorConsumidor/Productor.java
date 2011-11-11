/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductorConsumidor;

/**
 *
 * @author nanohp
 */
public class Productor implements Runnable{
    private SyncStack laPila;
    private int num;
    private static int counter = 1;
    
    public Productor(SyncStack s){
        laPila = s;
        num = counter++;
    }
    

    @Override
    public void run() {
        char c;
        
        for (int i = 0; i < 200; i++) {
            c = (char) (Math.random() * 26 +'A');
            laPila.push(c);
            System.out.println("Productor "+num+":"+c);
            try{
                Thread.sleep((int)(Math.random() * 300));
            }catch(InterruptedException e){
                System.err.println("InterruptedException");
            }
        }
    }
    
}
