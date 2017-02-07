class item
{
  int x,y;
  
item(int 10,int 10)
 { x=10;
   y=10;
   }

int add()
{ return(x+y);
}
  
}

class addi
{ 
public static void main(String[] args)
  { 
   item i=new item();
  int z=i.add();
 System.out.println("The sum is"+z);  
}
}
    