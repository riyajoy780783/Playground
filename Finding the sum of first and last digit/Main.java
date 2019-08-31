#include <stdio.h>
int main() {
	int n,r,sum;
  scanf("%d",&n);
  r=n%10;
  while(n>=10)
  {
    n=n/10;
}
  sum=n+r;
  printf("%d",sum);
	return 0;
}