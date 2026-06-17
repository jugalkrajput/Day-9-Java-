package com.revision;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");  // duplicate allowed
        list.add("Mango");
        
        System.out.println(list);  // [Apple, Banana, Apple, Mango]
        
        // Access by index
        System.out.println(list.get(0));  // Apple
        
        // Remove
        list.remove("Banana");
        System.out.println(list);  // [Apple, Apple, Mango]
        
        // Iterate
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}