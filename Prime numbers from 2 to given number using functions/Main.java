#include<stdio.h>
int main()
{
   	int n;
  	scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
  if (prime(i))
  {
  	printf("%d\n",i);
  }
  }
  return 0;
}
int prime(int n)
{
  int j,c=1;
  
    for(j=2;j<=n/2;j++)
      
    {
      if(n%j==0)
      {
        c=0;
        break;
      }
   }
  return c;
    }