package org.java;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Hai");
     int i=0,j=0,a;
     int n=154;
     a=n;
     while(a>0) {
    	 i=a%10;
    	 j=j+(i*i*i);
    	 a= a/10;
     }
    // System.out.println(i+j);
     if(n==j) {
    	 System.out.println("Amstrong");
     }
     else {
    	 System.out.println("not amstrong");
     }
	}

}
