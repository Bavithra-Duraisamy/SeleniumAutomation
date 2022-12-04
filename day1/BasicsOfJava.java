package week1.day1;

public class BasicsOfJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		//Primitive and Non-Primitive data types
		int wheels = 4;
		boolean isNew = true;
		char logo = 'H';
		String brnad = "Honda"; //String is non primitive here
		
		System.out.println(wheels);
		
		//Methods and Objects
		//Addition
		
		Maths add = new Maths();
		System.out.println(add.addition(3, 5));
		//Subtraction
		
		System.out.println(add.subtraction(10, 4));
		
		//Multiplication
		System.out.println(add.multiplication(10, 4));
		
		//Division
		System.out.println(add.division(10, 4));


	}

}
