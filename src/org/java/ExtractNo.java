package org.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNo {

	public static void main(String[] args) {
      
		Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("2 Rooms");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
	}

}
