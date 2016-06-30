package com.test.collection;

import java.util.ArrayList;

public class ArrayListDemo implements DemoInterface {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= DemoInterface.a;
		
		System.out.println(a);
		String testArray []={"one","two"};
		
		System.out.println(testArray.toString());
		
		int arr[]={1,2,3,4};
		//System.out.println(arr+1);

		ArrayList<String> arrayList=new ArrayList<>();
		// This class is roughly equivalent to Vector, except that it is unsynchronized
		//that is, adding n elements requires O(n) time
		 arrayList.add("fdf");
		 arrayList.add("fdfd");
		
		System.out.println(testArray.length);
		arrayList.trimToSize();
		
		ArrayList<String> arrayListClone=	(ArrayList<String>) arrayList.clone();
		for (String cloneArray : arrayListClone) {
			System.out.println(cloneArray);
		}
		
		System.out.println(arrayList.size());
		

	}

	
	 
}
