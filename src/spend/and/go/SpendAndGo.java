/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spend.and.go;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author ildar
 */
public class SpendAndGo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Yo Amir");

        do {
            System.out.println("Computer Science is really cool");
        } while (1 == 1);
    }

    public static void rafa(String text) throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\ildar\\OneDrive\\Documents\\NetBeansProjects\\Tests\\SplashInfo.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.seek(file.length());

        raf.write(0x0A);
        raf.writeBytes(text);
        raf.writeChars("\n");
        raf.close();
        
        
        

    }

}
