package Week3day2;

public  class Automation extends MultipleLangauge implements TestTool, Language  {

	public void java() {
		
		System.out.println("This is Java");
	
			}

	
	public void javaScript() {
		
		System.out.println("This is a java script");
		}
	
	
	public void ruby() {
		System.out.println("It's not a ruby");
	}
	
	public void selenium() {
		
		System.out.println("I'm Studying selenium");
	}
	
			
		
	public static void main(String[] args) {
		
		Automation obj = new Automation();
		
		obj.javaScript();
		obj.java();
		obj.ruby();
		obj.selenium();
		obj.python();
		
	}
	
	
	
}
