/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductorConsumidor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nanohp
 */
public class SyncStack {

    private List<Character> buffer = new ArrayList(400);

    public synchronized char pop() {
        char c;
        while (buffer.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
                System.err.println("InterruptedException");
            }
        }
        c = buffer.remove(buffer.size() - 1);
        return c;
    }

    public synchronized void push(char c) {
        this.notify();
        buffer.add(c);
    }
}
