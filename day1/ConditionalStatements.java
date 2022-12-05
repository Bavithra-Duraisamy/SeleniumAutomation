package week1.day1;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i<=20;i++) {
			if(i % 2 == 0)
				continue;
			System.out.println("The odd numbers between 1 and 20 are: "+i);
		}

	}

}
