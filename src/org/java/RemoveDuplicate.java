package org.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public RemoveDuplicate() {
		int a[] = { 2, 3, 3, 4, 5, 5, 6 };
		int flag = 0;
		Set<Integer> st = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (!st.contains(a[i])) {
				System.out.println(a[1]);
				st.add(a[i]);	
			}	
		}
		System.out.println(st);
	}
	public void Pyramid() {
		for (int i = 1; i <=5; i++) {
			for(int j=5; j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
		System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		RemoveDuplicate obj = new RemoveDuplicate();
		obj.Pyramid();
	}

}
