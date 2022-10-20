package Week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.github.dockerjava.api.model.Link;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		
		
      Set<Integer> d= new TreeSet<Integer>();
     
      {
	
	
	for(int i=0;i<data.length;i++) {
	
	   	    d.add(data[i]);
	}
		
		List dataList= new ArrayList<Integer>(d);
		                             
		System.out.println("The second largest number is "+dataList.get(dataList.size()-2));
		
		
		
		
		
		
		

	}

	}
}
