#include<stdio.h>
int natural_num(int m)
{
  int sum=0;
  for(int i=1;i<=m;i++)
  {
    sum=sum+i;
  }
  return sum;
}
int main() 
{
    int n,sum1;
  	scanf("%d",&n);
  	sum1 = natural_num(n);
  	printf("%d",sum1);
  return 0;
}