package com.revision;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3));
        System.out.println("Original: " + list);
        
        // Method 1: Using HashSet (order not preserved)
        Set<Integer> set = new HashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("Unique (HashSet): " + uniqueList);
        
        // Method 2: Using LinkedHashSet (preserves insertion order)
        Set<Integer> linkedSet = new LinkedHashSet<>(list);
        List<Integer> uniqueListOrdered = new ArrayList<>(linkedSet);
        System.out.println("Unique (LinkedHashSet): " + uniqueListOrdered);
        
        // Method 3: Manual way (without Set – for learning)
        List<Integer> manual = new ArrayList<>();
        for (Integer num : list) {
            if (!manual.contains(num)) {
                manual.add(num);
            }
        }
        System.out.println("Unique (manual): " + manual);
    }
}