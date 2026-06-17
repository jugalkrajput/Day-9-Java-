package com.revision;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // duplicate – ignored
        set.add("Mango");
        
        System.out.println(set);  // [Apple, Banana, Mango] (order not guaranteed)
        
        // Check existence
        System.out.println(set.contains("Apple"));  // true
        
        // Iterate
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}