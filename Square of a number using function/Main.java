#include<stdio.h>
int square(int m)
{
  int a=m*m;
  return a;
}
int main()
{
  int n,sq;
  scanf("%d",&n);
  sq=square(n);
  printf("%d",sq);
   return 0;
}