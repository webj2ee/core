package com.javaSkeleton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.SortingFocusTraversalPolicy;

public class TestMain {

	public static void main(String[] args) {
		WaysToIterate ways= new WaysToIterate();
		//ways.iterateWithForEach();
		List<String> names = getNames1();
       /* names.add(0,"mani");
        for (String string : names) {
			System.out.println(string);
		}*/
		
		 List<Integer> test = new ArrayList<>();
		    test.add(new Integer(2));

		    ArrayList<Integer> test2 = new ArrayList<>();
		    test2.add(new Integer(2));

		    List<Integer> test3 = Collections.emptyList();
		    // test3.add(new Integer(2));
		
		List<String> members =  new ArrayList<>(getNames());
		ArrayList<String> membersList = new ArrayList<String>(getNames());

		membersList.add("m");
	}
	
	private static List<String> getNames() {
        return Arrays.asList("akash", "Arnie", "Beth", "Lucy");
    }
	
	private static List<String> getNames1() {
	    return new ArrayList<>(Arrays.asList("akash", "Arnie", "Beth", "Lucy"));
	}

}
