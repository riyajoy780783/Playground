#include <stdio.h>

int main()
{
	int n,a;
  	scanf("%d",&n);
  	a=fact(n);
  	printf("%d",a);
	return 0;
}
int fact(int n)
{
  if(n==0)
  {
    return ;
  }
  else
    return n+fact(n-1);
}