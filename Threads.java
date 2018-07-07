/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import static java.lang.Thread.sleep;

/**
 *
 * @author syed arselan
 */

public class Threads extends Thread
{
    public Threads(String str)
    {
        super(str);
    }
    
    public void run()
    {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Run " + i + ": " + getName());
            try {sleep((int) (Math.random() * 1500));}
            catch (InterruptedException e){e.printStackTrace();}
        }
        System.out.println("Thread result: " + getName());
    }
}

