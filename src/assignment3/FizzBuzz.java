package assignment3;

public class FizzBuzz {

	public static void main(String[] args) {
		int [] num = {11,15,19,203,55};
		for (int i=0; i<num.length; i++) {
			if (num[i]%3==0&& num[i]%5==0)
			System.out.print(num[i] + " FizzBuzz , ");
			else if (num[i]%3==0)
			System.out.print(num[i] + " Fizz , ");
			else if (num[i]%5==0)
			System.out.print(num[i] + " Buzz , ");
			else
				System.out.println(num[i] + " Other Number , ");
			
				}}}


	


