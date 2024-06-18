package Shadowing;

public class FootBall extends Sports {
	
	
	public static void play()
	{
		System.out.println(" Goal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sports s=new FootBall();
		s.play();

	}

}
