package org.array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Arrays {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("enter how many food names do you want to enter"); int n =
		 * sc.nextInt(); String a[] = new String[n]; System.out.println("Go for it");
		 * sc.nextLine();
		 * 
		 * for(int i=0;i<a.length;i++)
		 * 
		 * a[i]= sc.nextLine();
		 * 
		 * System.out.println("The food name as follows"); for(int
		 * i1=0;i1<a.length;i1++) System.out.println(a[i1]);
		 * 
		 * 
		 * int num[]= new int[4]; num[0] = 5; num[1] = 10; num[2] = 15; num[3] = 20;
		 * 
		 * for (int i1 : num) { System.out.println(i1); }
		 * 
		 * 
		 */

		int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int total = 0;
		for (int i = 0; i < b.length; i++)
			total = total + b[i];
		double avg = total / b.length;
		System.out.println(total);
		System.out.println("The total is " + avg);

		System.out.println("=====to remove duplicates from array====");// to remove duplicates from array

		int a[] = { 10, 10, 20, 50, 60, 80, 60, 50 };
		Set<Integer> s = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++)
			s.add(a[i]);
		
		int b1[] = new int[s.size()];
		//s.toArray(b1);
		//Object[] b1 = s.toArray();

		System.out.println(b1.length);

		List l = new ArrayList();

	}
}