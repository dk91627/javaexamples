class swap
{
  public static void main(String[] args)
	{ 
		int number1,number2,temp=0;
		number1=10;
		number2=20;
		System.out.println("The values before swapping are "+number1+ " " +number2);
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("The values after swapping "+number1+ " "+number2);
}
}