package assignment2;

public class FindOddEven {

	public static void main(String[] args) {
		//(A)find OddEven number;
		int num = 100; 
		if(num %2 ==0)
		System.out.println(num + " is even");	
		else 
			System.out.println(num+ " is odd");
		//(b)find oddeven number;17,19,6,202,500,69
		
		
		int  [] p= {17,19,6,202,500,69};
		//  Endex   0, 1, 2,3,  4,  5;
		for (int i = 0;i<p.length;i++) {
			if(i%2==0)
			
				System.out.println( i  + " Endex number is even number");
			else 
			System.out.println(i  + " Endex number is odd number");
		
			}}}

        
