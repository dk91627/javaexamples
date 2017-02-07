import java.util.Scanner;
class sumOfNumbers
{
 	public static void main(String[] args) 
	  { int sum=0;
             Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1=input.nextInt();
		System.out.print("Enter the second number: ");
		int number2=input.nextInt();
		 sum=number1+number2;
		System.out.println("The sum of two numbers is "+sum);
}
}