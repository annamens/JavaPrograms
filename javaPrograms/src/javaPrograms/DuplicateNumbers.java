package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int a[] = { 3, 5, 8, 11, 10 };
		int b[] = { 2, 5, 6, 8, 13 };
		List<Integer> n= new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
				n.add(a[i]);
				}
			}
		}
		System.out.println(n);
		
		int x[] = { 3, 5, 8, 11, 5, 8, 10 };
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println(x[i]+" ");
				}
			}
			
		}
		System.out.println("============");

		Set <Integer> set = new HashSet <Integer>();
		for( Integer m:x) {
			if(set.add(m)==false) {
				System.out.print(m+" ");
			}
		}
		
	}

}
