package javaBasics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {


		Set<String> names = new LinkedHashSet<String>();
		names.add("Niteesha");
		names.add("Vinnetha");
		names.add("Vivek");
	
//		
//	    for(String name : names) {
//	    	System.out.println(name);
//	    }
	   
		Iterator<String> it = names.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

	}

}
