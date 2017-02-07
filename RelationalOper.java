import java.util.Scanner;
class RelationalOper
{
 public static void main(String[] args)
{

   Scanner in= new Scanner(System.in);
  System.out.println("Enter the first no.");   
int num1= in.nextInt();

System.out.println("Enter the second no.");
int num2 = in.nextInt();

System.out.println("The condition is "+(num1==num2));
}
}