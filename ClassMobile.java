package Week1.day1;

public class ClassMobile {

	
	/*
	 * classroom:3 =========== Create Class Mobile Create methodName 1.sendSms print
	 * type some txt message 2.takeSnapshot print type some txt Create object for
	 * Mobile Class and call two method then run the code Class Tab call all the
	 * methods in Tab class
	 */
	
	
	  public void sendSMS() {
	 
	  System.out.println("Hello"); } 
	  
	  public void takeSnapshot() {
	 
	  System.out.println("Take snap"); }
	  
	  public int add(int x) {
		
		  int a = 9;
		  
		  return x+a;
		

	}
	
	 public static void main(String[] args) {
		
		 ClassMobile m = new ClassMobile();
		 m.sendSMS();
		 m.takeSnapshot();
		 int add = m.add(5);
		 System.out.println(add);
	}
}
