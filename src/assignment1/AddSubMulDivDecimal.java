package assignment1;

public class AddSubMulDivDecimal {

	public static void main(String[] args) {
		double n1= 25.76;
		double n2= 35.98;
		double sum;
		sum = n1+n2;
		System.out.println(" 25.75+35.98= " +sum);
        
        double n3= 35.75;
        double n4= 75.45;
        double sub;
        sub = n4-n3;
        System.out.println(" 75.45-35.75= " + sub);
        
        double n5= 35.90; 
        double n6= 75.90;
        double multi;
        multi = n5*n6;
        System.out.println(" 35.90*75.90= " + multi);
        
        double n7=100.90;
        double n8=25.10;
        double div;
        div = n7/n8;
        System.out.println(" 100.90/25.10= " + div);
	}

}
