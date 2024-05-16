/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparingstrings;

/**
     This program correctly compares two String objects using
     the equals method.
 */
public class ComparingStrings {

    public static void main(String[] args) {
        
        String name1 = "john";
        String name2 = "jack";
        String name3 = "jack";
        
        
         //part of code below compare name1 and name2 literals
        if(name1.equals(name2))
        {
            System.out.println("The names " + name1 + " and " + name2 + " are exactly the same");     
        }
        else
        {
             System.out.println("The names " + name1 + " and " + name2 + " are not exactly the same"); 
        }
        
        //part of code below compare name2 and name3 literals
        if(name2.equals(name3))
        {
            System.out.println("The names " + name2 + " and " + name3 + " are exactly the same");     
        }
        else
        {
             System.out.println("The names " + name3 + " and " + name3 + " are not exactly the same"); 
        }
        
    }
}
