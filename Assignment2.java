/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author syed arselan
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Threads("Proc-2").start();
        new Threads("Proc-2").start();
        new Threads("Proc-3").start();
    } 


}    
