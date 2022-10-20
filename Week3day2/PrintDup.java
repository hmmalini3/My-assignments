package Week3day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDup {

	public static void main(String[] args) {
		
		int[] data = {4,3,5,6,8,7,5,29,1,2,4,7,8};
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		// 4,3,6,8,29,1,2,7
		
		for (int i = 0; i < data.length; i++) {
			
			if (!set.add(data[i])) {
				
				System.out.println(data[i]);
				
			}
			
		}
		
	}
	
}
     

