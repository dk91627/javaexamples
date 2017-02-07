import java.util.Scanner;

class ReadingConsole
{
   public static void main(String[] args)
  {
  	Scanner input = new Scanner(System.in);
	System.out.println("Enter the name");
	int i= input.nextInt();
	System.out.println("The name is "+i);
}
}