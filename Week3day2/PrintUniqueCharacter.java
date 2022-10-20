package Week3day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String name= "Hema Malini";
		
		char[] chars = name.toCharArray();
//		System.out.println(Arrays.toString(chars));
		
		Set<Character> n = new HashSet<Character>();
		
		for (int i = 0; i < chars.length; i++) {
			
			n.add(chars[i]);
			
		}
		System.out.println(n);
	}


	
	 
   
	
	
}
