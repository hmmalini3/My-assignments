
public class CellPhone {
	
	
	public void makecall(String mobilemodel, long mobilenumber) {
		
		System.out.println("My mob model is" +  mobilemodel);
		
		System.out.println("My mob number is" +  mobilenumber);
	}

	
	public void sendVoicesms(String alphabets, int cost) {
		
		System.out.println("My voice call is" + alphabets);
		
		System.out.println("My mob cost is" + cost);
	}
	
	
	public static void main(String[] args) {
		CellPhone C= new CellPhone();
		C.makecall("Vivo", 3289593866l);
		C.sendVoicesms("Hello", 12000);
		
	}
}
