package Shadowing;

public class Mars extends Planet {

	public void temp()
	{
		System.out.println(" distance from Mars is 2000");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planet p=new Mars();
		p.temp();

		
		Planet p1=new Earth();
		p1.temp();
		
	}

}
// Method Overriding