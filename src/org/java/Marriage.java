package org.java;

public class Marriage extends Boy {

	public void girlname() {
		System.out.println("girlname");
	}
	public void common() {
       System.out.println("common girl");
	}
	private Marriage() {
		System.out.println("I am child constructor");
	}
	public static void main(String[] args) {
		Boy m=new Marriage();
	}
	
	

}
