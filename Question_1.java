/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exam;
import java.util.Scanner;
/**
 *
 * @author fletc
 */
public class Question_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int value=in.nextInt();
        
        if(value%2==0){
        System.out.println("Number is even");
        }
        else{
        System.out.println("Number is odd");
        }
        
    }
    
}
