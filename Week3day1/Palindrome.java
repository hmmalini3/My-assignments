package Week3day1;

public class Palindrome {

	public static void main(String[] args) {
		
    String s = "madam";
    String rev="";
    
    
    char[] ch = s.toCharArray();
    
    for(int i=ch.length-1;i>=0;i--) {
    	
    	rev=rev+ch[i];
    	    	
    }
     System.out.println(rev);
    if(rev.equals(s)){
    	
         System.out.println("This is a Panlindrome");
    }
         else {
        	 System.out.println("This is not a Panlindrome");
         }
    
		
		
		
		
		
	}

}
