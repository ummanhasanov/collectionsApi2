/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package queue;

import java.util.PriorityQueue;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();
        // for add used offer() or add()
        queue.offer("Sarkhan");
        queue.offer("Azay");
        queue.offer("Umman");
        
        queue.peek();
        queue.poll();
               
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
