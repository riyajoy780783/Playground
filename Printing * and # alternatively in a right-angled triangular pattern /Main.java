#include <stdio.h>
int main()
	{
  	int n,num=0;
  	scanf("%d",&n);
  	for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
      num=num+1;
      if(num%2==1)
      	printf("*");
      else
        printf("#");
    }
  	printf("\n");
	}
	
  	return 0;
}