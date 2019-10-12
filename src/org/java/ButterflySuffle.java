package org.java;

public class ButterflySuffle {
    private void suffle() {
    	int a[]= {0,1,2,3,4,5,6,7,8,9};
    	int len=a.length/2;
    	for (int i = len-1; i>=0; i--) {
			System.out.println(a[i]);		
		}
    	for (int i = a.length-1; i >=len; i--) {
			System.out.println(a[i]);
			
		}
    }
	public static void main(String[] args) {
         ButterflySuffle obj=new ButterflySuffle();
         obj.suffle();
	}

}
