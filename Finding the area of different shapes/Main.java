import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
         double PI = 3.14d;
         switch(r)
      {
        case 1:
          int s=sc.nextInt();
          System.out.println(s*s);
             break;
           case 2:
           int k=sc.nextInt();
           int m=sc.nextInt();
          System.out.println(k*m);
            break;              
           case 3:
           int t=sc.nextInt();
           int o=sc.nextInt();
          System.out.println((t*o)/2);
              break;
           case 4:
           int p=sc.nextInt();
          System.out.println(PI*p*p);
              break;
      }
    }
}