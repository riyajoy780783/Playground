import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=r;i>0;i--)
        {
        	
          for(int j=c;j>0;j--)
          {
        	  if(i<=j)
        	  System.out.print(j);
        	  else
        		  System.out.print(i);
          }
        	
          System.out.println();
        }
            
    }
}