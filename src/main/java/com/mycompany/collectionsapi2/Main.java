/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.collectionsapi2;

import java.util.HashSet;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {
       
        
        
        HashSet<String> set = new HashSet<>();// set ailesi unique-dir
        set.add("Azay");
        set.add("Azay");
        set.add("Azay");
        set.add("Azay");
        set.add("Azay");
        
        
        for (String s : set) {
            System.out.println(s);
        }
    }
}
