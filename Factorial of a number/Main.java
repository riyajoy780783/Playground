#include <stdio.h>
int main() {
	int n,fact=1,sum=0;
  	scanf("%d",&n);
  	for(int i=1;i<=n;i++)
    {
      	fact=fact*i;
    }
  sum=sum+fact;
  printf("%d",sum);
	return 0;
}