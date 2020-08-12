package exercise3;


import java.util.Scanner;
/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELCOT
 */
public class NearestInteger {
    public static void main(String[] args) {
     
      double c= returnnearestint.nint();
       int integer=(int) c;
       System.out.println("the nearest integer value is: "+integer);
       
        
    }
    
}
class returnnearestint {
    static double a=8.03;
    static double nint()
    {
      return ++a; 
    }
}
