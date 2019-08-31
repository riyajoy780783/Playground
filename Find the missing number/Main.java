#include<stdio.h>
int main()
{
 int n,k,i;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
   int found=0;
    k=0;
    for(int j=0;j<n;j++)
    {
      k=a[j];
      if(i==k)
      {
        found=1;
      }
    }
    if(found==0)
      printf("%d",i);
  }
  return 0;
}