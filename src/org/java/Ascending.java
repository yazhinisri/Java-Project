package org.java;

import java.util.AbstractList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ascending {
	private void ascendingOrder() {
     
	}
    public static void main(String[] args) {
    	int a[]= {5,6,3,2,7};
    	Set<Integer> s=new TreeSet<>();
    	for (int i = 0; i < a.length; i++) {
			s.add(a[i]);	
		}
    	  System.out.println(s);
		}
       List<Integer> l=new AbstractList<Integer>() {

		@Override
		public Integer get(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	}

