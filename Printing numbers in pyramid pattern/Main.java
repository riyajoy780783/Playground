#include <stdio.h>
int main() {
	int n,num=1;
  	scanf("%d",&n);
  	for(int i=1;i<=n;i++)
       {
      for(int s=1;s<=(n-i);s++)
      {
        printf(" ");
      }
      for(int j=1;j<=i;j++)
      {
        printf("%d ", num);
        num=num+1;
      }
      printf("\n");
    }
	return 0;
}