package Shadowing;

public class Son extends Father {
	
	
	public void bike()
	{
		System.out.println("RE");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father f=new Son();
		f.bike();
		
	}

}


// Runtime Polymorphism