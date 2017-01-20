/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spend.and.go;

/**
 *
 * @author ildar
 */
public class SpendAndGo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TransactionsQueue q = new TransactionsQueue(4);

        q.enqueue("First element");
        q.enqueue("second element");
        q.enqueue("third element");
        q.dequeue();
        System.out.println("----------");
        System.out.println(q.capacity());
        
        
        

    }

}
