package com.test.collection;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap vehicles = new TreeMap();
		
		// Add some vehicles.
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		
		System.out.println("Total vehicles: " + vehicles.size());
		System.out.println(	"pollFirstEntry-->"	+vehicles.pollFirstEntry()
);
		// Iterate over all vehicles, using the keySet method.
		for(Object key: vehicles.keySet())
			System.out.println(key + " - " + vehicles.get(key));
		System.out.println();
		
		System.out.println("Highest/last key: " + vehicles.lastKey());
		System.out.println("Lowest/first key: " + vehicles.firstKey());
		
		System.out.println("\nPrinting all values:");
		for(Object val: vehicles.values())
			System.out.println(val);
		System.out.println();
		
		// Clear all values.
		vehicles.clear();
		
		// Equals to zero.
		System.out.println("After clear operation, size: " + vehicles.size());
	}

}
