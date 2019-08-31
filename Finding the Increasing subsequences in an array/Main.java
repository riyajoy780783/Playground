#include<stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
   int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
   for(int j=0;j<n;j++)
   {
      for(int k=j;k<n;k++)
      {
        if(a[k]>a[j])
        printf("%d,%d\n",a[j],a[k]);
      }}
  
	return 0;
}