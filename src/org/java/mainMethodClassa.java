package org.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.w3c.dom.views.AbstractView;

public class mainMethodClassa {

	public static void main(String[] args) {
      int n=1345;int a;int i=0;int j=0;
      a=n;
      while(a>0) {
    	  i=a%10;
    	  j=j+i;
    	  a=a/10;
      }
      System.out.println(j);
      
	}
}
