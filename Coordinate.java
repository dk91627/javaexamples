import java.util.Scanner;
class Point
{
	int i=0;
	Scanner in=new Scanner(System.in);
	int insertPoint[][]=new int[10][2];
	int quad1[][]=new int[4][2];
	int quad2[][]=new int[4][2];
	int quad3[][]=new int[4][2];
	int quad4[][]=new int[4][2];
	int count=0;
	int count1=0;
	int count2=0;
	int count3=0;
	int count4=0;
	
	void inputPoint()
	{
		
			System.out.println("Enter the x and y co-ordinates");
			int x=in.nextInt();
			int y=in.nextInt();
			
			for(int i=0;i<10;i++)
			{
				int j=0;
				if(insertPoint[i][0]==x && insertPoint[i][1]==y)
				{
 					System.out.println("Point already available..  Please enter another co-ordinates");
				}
			}
			
			
			
			insertPoint[i][0]=x;
			insertPoint[i][1]=y;
					
			i++;
			count++;
			
	}
	
	void quadrant()
	{
		int j1=0;
		int j2=0;
		int j3=0;
		int j4=0;
		for(int i=0;i<count;i++)
		{
			if(insertPoint[i][0]>0 && insertPoint[i][1]>0)
			{
				
				quad1[j1][0]=insertPoint[i][0];
				quad1[j1][1]=insertPoint[i][1];
				j1++;
				count1++;
			}
			else if(insertPoint[i][0]<0 && insertPoint[i][1]>0)
			{
				
				quad2[j2][0]=insertPoint[i][0];
				quad2[j2][1]=insertPoint[i][1];
				j2++;
				count2++;
			}
			else if(insertPoint[i][0]<0 && insertPoint[i][1]<0)
			{
				
				quad3[j3][0]=insertPoint[i][0];
				quad3[j3][1]=insertPoint[i][1];
				j3++;
				count3++;
			}
			else if(insertPoint[i][0]>0 && insertPoint[i][1]<0)
			{
				
				quad4[j4][0]=insertPoint[i][0];
				quad4[j4][1]=insertPoint[i][1];
				j4++;
				count4++;
			}
		}
		
	}
	
				


	void findQuadrant()
		{
		quadrant();
		System.out.println("Quadrant 1 points are :");
		for(int i=0;i<count1;i++)
		{
			System.out.println(quad1[i][0]+","+quad1[i][1]);
		}
		System.out.println("Quadrant 2 points are :");
		for(int i=0;i<count2;i++)
		{
			System.out.println(quad2[i][0]+","+quad2[i][1]);
		}
		System.out.println("Quadrant 3 points are :");
		for(int i=0;i<count3;i++)
		{
			System.out.println(quad3[i][0]+","+quad3[i][1]);
		}
		System.out.println("Quadrant 4 points are :");
		for(int i=0;i<count4;i++)
		{
			System.out.println(quad4[i][0]+","+quad4[i][1]);
		}
		
	}

	void checkDistance()
	{
		inputPoint();
		quadrant();
		double dis=0;
		double mindis=0;
		int x=insertPoint[i-1][0];
		int y=insertPoint[i-1][1];
		
		System.out.println("Enter the quadrant from which you want to calculate its nearest distance");
		int quad=in.nextInt();
		
		if(quad==1)
		{
			mindis=Math.sqrt((Math.pow((quad1[0][0]-x),2))+(Math.pow((quad1[0][1]-y),2)));
			for(int i=0;i<count1;i++)
			{	
				dis=Math.sqrt((Math.pow((quad1[i][0]-x),2))+(Math.pow((quad1[i][1]-y),2)));
				if(dis<=mindis)
				{
					mindis=dis;
				}
			}
		}
		
		else if(quad==2)
		{
			mindis=Math.sqrt((Math.pow((quad2[0][0]-x),2))+(Math.pow((quad2[0][1]-y),2)));
			for(int i=0;i<count2;i++)
			{
				dis=Math.sqrt((Math.pow((quad2[i][0]-x),2))+(Math.pow((quad2[i][1]-y),2)));
				if(dis<mindis)
				{
					mindis=dis;
				}
			}
		}
		
		else if(quad==3)
		{
			mindis=Math.sqrt((Math.pow((quad3[0][0]-x),2))+(Math.pow((quad3[0][1]-y),2)));
			for(int i=0;i<count3;i++)
			{
				dis=Math.sqrt((Math.pow((quad3[i][0]-x),2))+(Math.pow((quad3[i][1]-y),2)));
				if(dis<mindis)
				{
					mindis=dis;
				}
			}
		}
		
		else if(quad==4)
		{
			mindis=Math.sqrt((Math.pow((quad4[0][0]-x),2))+(Math.pow((quad4[0][1]-y),2)));
			for(int i=0;i<count4;i++)
			{
				dis=Math.sqrt((Math.pow((quad4[i][0]-x),2))+(Math.pow((quad4[i][1]-y),2)));
				if(dis<mindis)
				{
					mindis=dis;
				}
			}
		}
		
	
	System.out.println("The minimum distance from point "+x+","+y+" is "+mindis);
	
	}
}

class Main
{
	public static void main(String[] args)
	{
		Point p=new Point();
		Scanner in = new Scanner(System.in);
		int choi;
		do
		{
		
		System.out.println("1. Enter new point");
		System.out.println("2. Find quadrant");
		System.out.println("3. Check the nearest distance of point from any quadrant");
		System.out.println("Please enter your  choice...(1-3)");
		int ch=in.nextInt();

		switch(ch)
		{

			case 1: 
					p.inputPoint();
					break;
			
			case 2:
					p.findQuadrant();
					break;
			
			case 3:
					p.checkDistance();
					break;
		
		}
		
		
		System.out.println("Do u want to go through again (1/0)");
		choi=in.nextInt();
		}
		while(choi==1);
	}
	
}
					