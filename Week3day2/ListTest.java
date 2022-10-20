package Week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ListTest {

	public static void main(String[] args) {
		
		String[] name= {"Adam","Ben", "Zara", "Adam", "Charlie", "James", "Ben"};
		
		List<String> list = new ArrayList<String>();
		
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		
		for (int i = 0; i < name.length; i++) {
			
			list.add(name[i]);
			
		}
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			
			for (int j = i+1; j < list.size(); j++) {
				
				if (list.get(i)==list.get(j)) {
					
					System.out.println(list.get(i));
					
				}
				
			}
			
			
			
		}
	}
		
	}
	
