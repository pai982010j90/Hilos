/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mod15;

/**
 *
 * @author nanohp
 */
public class Mod15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        
        HelloRunner r = new HelloRunner();
        Thread t = new Thread(r);
        t.start();

        while (true) {
            System.out.println("En main Hola " + i++);
            if (i == 100) {
                break;
            }
        }
    }
}

class HelloRunner implements Runnable {

    int i;

    @Override
    public void run() {
        i = 0;
        while (true) {
            System.out.println("HelloRunner Hola " + i++);
            if (i == 50) {
                break;
            }
        }
    }
}
