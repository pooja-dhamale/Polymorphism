package Shadowing;

public class Yardley extends Perfume {
	
	int price=1000;
	int qty=9;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perfume p=new Yardley();
		System.out.println(p.price);
		System.out.println(p.qty);

	}

}


//Variable Shadowing Programs
