import java.util.Scanner;
class EvenOrOdd
{
 public static void main(String[] args)
{

 Scanner in = new Scanner(System.in);
System.out.println("Enter the no.");	
int num1=in.nextInt();
String a="even";
String b="odd";
String big = num1%2?a:b;
System.out.println("The greater no is "+big);

}
}