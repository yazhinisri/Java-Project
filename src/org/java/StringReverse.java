package org.java;

import java.lang.reflect.Array;


public class StringReverse {
	static String str="WeLcoMe";
	String finalStr="";
	public  void ReverseString() {
		
		String st="";
		char[] ch = str.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
		    st=st+ch[i];
			
		}
		System.out.println(st);
	}
	public  void upperToLower() {
		 char[] AllLetters = str.toCharArray();
		 for (char c : AllLetters) {
			 if (Character.isUpperCase(c)) {
				 String uprStr = ""+c;
				 uprStr=uprStr.toLowerCase();
				finalStr=finalStr+uprStr;
			} else if(Character.isLowerCase(c)) {
               String lwrStr=""+c;
               lwrStr=lwrStr.toUpperCase();
               finalStr=finalStr+lwrStr;
			}
		     
		}
		 System.out.println(finalStr);
        
	}

	public static void main(String[] args) {
		//stringReverse();
		String s1="Greens";
		String s2="Greens";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	
	//	System.out.println(System.identityHashCode(s2));
		
		StringReverse sr=new StringReverse();
		sr.upperToLower();
		
	}

}
