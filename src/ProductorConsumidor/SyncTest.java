/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductorConsumidor;

/**
 *
 * @author nanohp
 */
public class SyncTest {

    public static void main(String[] args) {
        SyncStack stack = new SyncStack();

        Productor p1 = new Productor(stack);
        Thread prodT1 = new Thread(p1);
        prodT1.start();

        Productor p2 = new Productor(stack);
        Thread prodT2 = new Thread(p2);
        prodT2.start();

        Consumidor c1 = new Consumidor(stack);
        Thread consT1 = new Thread(c1);
        consT1.start();

        Consumidor c2 = new Consumidor(stack);
        Thread consT2 = new Thread(c2);
        consT2.start();


    }
}
