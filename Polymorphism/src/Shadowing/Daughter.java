package Shadowing;

public class Daughter extends Mother {
	
	
	public static void marry()
	{
		System.out.println("Vicky Kaushal");
	}

	public static void main(String[] args) {
		Mother m=new Daughter();
		m.marry();
	}
}
