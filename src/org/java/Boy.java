package org.java;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Boy extends Abstractlearning {

	@Override
	void Abstratlearning() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				if (count == 1) {
					System.out.print("+");
					count=0;
				}
				if (count == 0) {
					System.out.print("*");
					count=1;
				}
			}
			System.out.println();
		}
	}
}
