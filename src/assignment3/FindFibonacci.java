package assignment3;

public class FindFibonacci {

	public static void main(String[] args) {
		//0,1,1,2,3,5,,8,13,21,34.....
		int renge= 10;
		int n1=0;
		int n2=1;
		int n3;
		System.out.print("Fibonicci series : "  + n1+" , "+n2);
		for (int i=0;i<renge;i++) {
			n3=n1+n2;
			System.out.print(" ," +n3);
			n1=n2;
			n2=n3; 
			}}}
	


