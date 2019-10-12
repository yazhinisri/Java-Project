package org.java;

import java.util.HashMap;
import java.util.Map;

public class RepetativeWords {
	String str="hai how are you hai how is life";
	public void repetative() {
		String[] AllWords = str.split(" ");
		Map<String, Integer> m=new HashMap<>();
		for (String word : AllWords) {
			if (m.containsKey(word)) {
				Integer val = m.get(word);
				m.put(word, val+1);
			} else {
                  m.put(word, 1);
			}
		}
		System.out.println(m);
	}
	public static void main(String[] args) {
		RepetativeWords obj=new RepetativeWords();
		obj.repetative();
	}

}

