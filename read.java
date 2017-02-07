class read
{
  public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the character to be converted");
		int i =System.in.read();
		i=i-32;
		char ch =(char)i;
   		System.out.println("The charcter is : "+ch);
}
}
