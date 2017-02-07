import java.util.Scanner;
class quadratic
{
 	public static void main(String[] args) 
	  {  
		double D;
		double x1;
		double x2;
                Scanner input = new Scanner(System.in);
		System.out.print("Enter  a: ");
		double a=input.nextDouble();
		System.out.print("Enter  b: ");
		double b=input.nextDouble();
		System.out.print("Enter c: ");
		double c=input.nextDouble();   
		
		System.out.printf("\n%.1fx2 + %.1fx + %.1f\n",a,b,c);              
		D=Math.sqrt(Math.pow(b,2) - (4*a*c));	
		
		 x1=(-b+D)/(2*a);
				
			
		x2=(-b-D)/(2*a);	
		 
		System.out.println("The two roots of quadratic equation are: "+x1+","+x2);
}
}