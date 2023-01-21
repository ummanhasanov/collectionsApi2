/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {
       
        
        
        Set<String> set = new TreeSet<>();// set ailesi unique-dir
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
