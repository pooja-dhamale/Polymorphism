package Shadowing;

public class Redme extends Phone {

	
	public static void call()
	{
		System.out.println("Calling Pooja");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p=new Redme();
		p.call();
		
		
		

	}

}


// Rues:-

// Is a relationship is mandatory
// only for Static Methods
// Return type should be same.