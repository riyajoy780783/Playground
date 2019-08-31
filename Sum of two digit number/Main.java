#include<stdio.h>
int main()
{
  int a,b,sum,num;
  scanf("%d",&num);
  a=num%10;
  b=num/10;
  sum=a+b;
  printf("%d",sum);
  return 0;
}