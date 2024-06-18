package Shadowing;

public class Rainy extends Season {
	
	public void month()
	{
		System.out.println("June");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season s=new Rainy();
		s.month();
		
		

	}

}

//Method Overriding