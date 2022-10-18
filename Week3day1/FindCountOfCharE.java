package Week3day1;

public class FindCountOfCharE {

	public static void main(String[] args) {
		String s= "TestLeaf";
	    int count=0;
	    char[] ch=s.toCharArray();
	    for(int i=0;i<ch.length-1;i++) {
	    	if(ch[i]=='e'){
	    	 count++;
	    	 
	    	}
	    }
    System.out.println("The Character E has a count of "+count+" in the string value");
	}

}
