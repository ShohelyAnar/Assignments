package assignment2;

public class SwapValue {

	public static void main(String[] args) {
		int x=25;
		int y=35;
		System.out.println("x= "+x  + ",  before swap");
       System.out.println("y= "+y  + ",  before swap");
	
        int temp ;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x= "+x  + ",  after swap");
        System.out.println("y= "+y  + ",  after swap");
        }

}
