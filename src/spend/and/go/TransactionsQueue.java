/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spend.and.go;

import java.util.ArrayList;

/**
 *
 * @author ildar
 */
public class TransactionsQueue {

    private String[] queue;
    private String first;
    private String last;
    private int length;

    public TransactionsQueue() {
        this.queue = new String[10];
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    public int size() {
        return length;
    }

    public void enqueue(String st) {
        
    }
    
    public void dequeue(){
        
        
    }

    public String peek() {
        return this.first;
    }

}
