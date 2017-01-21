/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpendAndGo;

/**
 *
 * @author ildar
 */
public class SpendAndGoTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TransactionsQueue q = new TransactionsQueue(4);
        InfoDictionary a = new InfoDictionary(3);
        
        a.addInfo("#1", "#1s");
        a.addInfo("#2", "#2s");
        a.addInfo("#3", "#3s");
        
        System.out.println(a.toString());
        
        
        

    }

}
