#include<stdio.h>
int main()
{
  int n1,n2;
  scanf("%d %d",&n1,&n2);
  printf("%d",power(n1,n2));
  return 0;
}
int power(int b,int e)
{
  int power;
  power=pow(b,e);
  return power;
}