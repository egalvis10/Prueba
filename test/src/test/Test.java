/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JOptionPane;

/**
 *
 * @author Teban1503
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       String name = JOptionPane.showInputDialog("Write your name");
        // TODO code application logic here
        System.err.println("test" + " " + name );
    }
    
}
