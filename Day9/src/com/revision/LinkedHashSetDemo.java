package com.revision;

import java.util.*;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("Z");
		set.add("A");
		set.add("C");
		System.out.println(set);  // [Z, A, C]  (insertion order)

	}
}

