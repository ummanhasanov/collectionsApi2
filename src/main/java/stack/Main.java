/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package stack;

import java.util.Stack;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        // 
        stack.add("Sarkhan");
        stack.add("Azay");
        stack.add("Umman");
        
        stack.peek();
        stack.pop();
               
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
