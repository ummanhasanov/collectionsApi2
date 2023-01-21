/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.collectionsapi2.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Azay");
        list.add("Azay");
        list.add("Azay");
        list.add("Azay");
        list.add("Umman");
        list.add("Umman");
        list.add("Umman");
        list.add("Umman");
        list.add("Elchin");
        list.add("Elchin");
        list.add("Elchin");
        list.add("Elchin");

        System.out.println("all added into list");
        System.out.println();
        // this code will print all added list
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------");

        System.out.println("unique added into list");

        Set<String> set = new HashSet<>(list);
        System.out.println();

        // this code will print unique by one of any added list
        for (String s : set) {
            System.out.println(s);
        }
    }
}
