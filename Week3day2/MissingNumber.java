package Week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] num = {4,5,3,8,6,5,2,1,3};
		
		Set<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			
			set.add(num[i]);
			
		}
		
		System.out.println(set);
		
		List<Integer> list = new ArrayList<Integer>(set);
		for (int i = 1; i <= list.size(); i++) {
			
			if (i!=list.get(i-1)) {
				
				System.out.println(i);
				
			}
			
		}
		
	}
		
	}