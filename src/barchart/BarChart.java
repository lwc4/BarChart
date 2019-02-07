/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barchart;
import java.util.Scanner;

/**
 *
 * @author chalo
 */
public class BarChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int artScore = 0;
        int bobScore =0;
        int calScore = 0;
        int danScore =0;
        int eliScore =0;
        int index;
        
        System.out.println("Enter Points scored by Art ");
        artScore=input.nextInt();
      
           System.out.println("Enter Points scored by Bob ");
        bobScore=input.nextInt();
        
           System.out.println("Enter Points scored by Cal ");
        calScore=input.nextInt();
        
           System.out.println("Enter Points scored by Dan ");
        danScore=input.nextInt();
        
           System.out.println("Enter Points scored by Eli ");
        eliScore=input.nextInt();
        
       System.out.println("Points for Game\n");
       
       System.out.println("Art\t");
        for (index =0; index < artScore; index++)
        System.out.print("*");
       System.out.println();
       
           System.out.println("Bob\t");
       for (index =0; index < bobScore; index++)
        System.out.print("*");
       System.out.println();
       
           System.out.println("Cal\t");
       for (index =0; index < calScore; index++)
        System.out.print("*");
       System.out.println();
       
           System.out.println("Dan\t");
       for (index =0; index < danScore; index++)
        System.out.print("*");
       System.out.println();
       
           System.out.println("Eli\t");
       for (index =0; index < eliScore; index++)
        System.out.print("*");
       System.out.println();
       
    }
    
}
