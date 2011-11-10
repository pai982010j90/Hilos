/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mod15;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author nanohp
 */
public class HelloRunnerG {

    private JFrame f;
    private static JTextArea a1, a2;

    public HelloRunnerG() {
        f = new JFrame();
        a1 = new JTextArea();
        a2 = new JTextArea();
        f.add(a1, BorderLayout.EAST);
        f.add(a2, BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public JTextArea getA1() {
        return a1;
    }

    public JTextArea getA2() {
        return a2;
    }

    public void mostrar() {
        f.setSize(300, 300);
        f.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;

        HelloRunnerG hRG = new HelloRunnerG();
        hRG.mostrar();

        HelloRunnerHiloG r = new HelloRunnerHiloG();
        Thread t = new Thread(r);
        t.start();

        while (true) {
            String cadena = a1.getText() + "En main Hola" + i++ + "\n";

            a1.setText(cadena);
            if (i == 2) {
                break;
            }
        }
    }

    static class HelloRunnerHiloG implements Runnable {

        int i;

        @Override
        public void run() {
            i = 0;
            while (true) {
                //System.out.println("HelloRunner Hola " + i++);
                String cadena = a2.getText() + "HelloRunner Hola " + i++ + "\n";

                a2.setText(cadena);

                if (i == 50) {
                    break;
                }
            }
        }
    }
}
