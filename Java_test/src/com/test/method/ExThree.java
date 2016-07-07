package com.test.method;

class X{}
class Emp{}
class Y {}
class Student{}

public class ExThree {
		// instance Method 
			void m1(X x, Emp e){ // var in parameter is local val 
				// here val ids type of class 
				System.out.println("M1 instance Method"); 
			}
			// static Method here values of class type
			static void  m2(Y y,Student s){
				System.out.println("M2 static Method"); 
 
			}
		public static void main(String[] args) {
			ExThree exTwo=new ExThree();
			exTwo.m1(new X(),new Emp() );
			
			ExThree.m2(new Y(), new Student());
		}

	}

