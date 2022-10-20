package Week3day2;

public class Iphone implements Mobile{

	public void sendSMS() {
		System.out.println("Hello");
	}
	
	public void dailNumbers() {
		
		System.out.println("The number has entered");
	}
	
	public void switchOn() {
		
		System.out.println("The mobile switched on");
	}
	
	public static void main(String[] args) {
		Iphone p = new Iphone();
		p.sendSMS();
		p.dailNumbers();
		p.switchOn();
		
		
	}
}
