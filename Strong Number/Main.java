#include <stdio.h>
int main() {
	int n,r,sum=0,num,fact=1;
  	scanf("%d",&n);
  	num=n;
  	while(n>0)
    {
      	fact=1;
      	r=n%10;
      	for(int i=1;i<=r;i++)
        {
          fact=fact*i;
        }
      	sum=sum+fact;
      	n=n/10;
    }
    if(sum==num)
  		printf("Yes");
  	else
    	printf("No");
     return 0;
}