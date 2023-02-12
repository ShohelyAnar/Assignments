 package assignment2;

public class AddOddAndEvenNUmber {
	public static void main(String[] args) {
		//1 to 20 sum all even number:
		int sum=0;
		System.out.println("Add all even number from 1 to 20");
		for (int i=0;i<=20;i++) {
			if(i%2==0) 
				sum+=i;
		}
			System.out.println("the result is" +sum);
		
			
		
		
		
		int add=0;
		System.out.println("Add all odd number from 50 to 70");
		for (int j=50;j<=70;j++) {
			if(j%2!=0) 
				add+=j;
		}
			
			System.out.println("the result is" +add);
		
	}
}