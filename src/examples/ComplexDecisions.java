/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import java.util.Scanner;

public class ComplexDecisions{
    public static void main(String [] args){
        Scanner keyboard = new Scanner (System.in);
        
// complex decision
        System.out.println("What is the temperature outside? ");
        int temperature = keyboard.nextInt();
        keyboard.nextLine();
        if (temperature<0)
            System.out.println("It's freezing - you better go home");
        else if (temperature>25){
            System.out.println("Great!");
            System.out.println("Let's go to the beach!");
            System.out.println("Pack your stuff and wait outside");             
        }
        else if (temperature > 15)
            System.out.println("This is perfect for some sport activity!"); 
        else
            System.out.println("OK. You can go for a walk");
        
        keyboard.close();
    } // main method end
} // class end
