package com.test.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapDemo {
	
	public static void main(String[] args) {
		System.out.println("----------HashMapDemo-----------");
		
		HashMap<Object, Object> hashMapTest=new HashMap<>();
		hashMapTest.put("first", "First Values");
		hashMapTest.put("Second", "Second Values");
		hashMapTest.put("Third", "Third Values");
		hashMapTest.put("Fourth", "Fourth Values");
		hashMapTest.put("Fifth", "Fifth Values");
		hashMapTest.put("Fourth", "Fourth Values");
		hashMapTest.put("Fifth", "Fifth Values");
		System.out.println(hashMapTest.values());
		
	}

}
