/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

public class BooleanExpressions{
    public static void main(String [] args){

        int x = 7;
        
// basic Boolean expressions
        System.out.println("x is " + x);
        System.out.print("x==3 is ");
        System.out.println(x==3);
        System.out.print("x!=5 is ");
        System.out.println(x!=5);
        System.out.print("x<10 is ");
        System.out.println(x<10);
        System.out.print("x<=7 is ");
        System.out.println(x<=7);
        System.out.print("x>8 is ");
        System.out.println(x>8);
        System.out.print("x>=7 is ");
        System.out.println(x>=7);
        
// compound Booolean expressions
        System.out.println();
        System.out.print("x>3 && x<6 is ");
        System.out.println(x>3 && x<6);
        System.out.print("x>3 || x<6 is ");
        System.out.println(x>3 || x<6);
        System.out.print("!(x>3) is ");
        System.out.println(!(x>3));
        
// truth tables
        System.out.println();
        System.out.println("true  && true  -> "+(true  && true));
        System.out.println("true  && false -> "+(true  && false));
        System.out.println("false && true  -> "+(false && true));
        System.out.println("false && false -> "+(false && false));
        System.out.println();
        System.out.println("true  || true  -> "+(true  || true));
        System.out.println("true  || false -> "+(true  || false));
        System.out.println("false || true  -> "+(false || true));
        System.out.println("false || false -> "+(false || false));
        
    } // main method end
} // class end
