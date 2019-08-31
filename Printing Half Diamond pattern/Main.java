#include <stdio.h>
int main() {
  	int n;
  	scanf("%d",&n);
	for(int i=1;i<=n;i++)
    {
      int t=i-1;
      for(int s=1;s<=(n-i);s++)
      {
        printf(" ");
      }
      for(int j=1;j<=(i+t);j++)
      {
        printf("*");
      }
      printf("\n");
    }
	return 0;
}