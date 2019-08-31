#include<stdio.h>
int main()
{
 int n,k,max,found,count,g;
  scanf("%d %d",&n,&k);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=1;i<=k;i++)
  {
   found=0;
    count=0;
    for(int j=0;j<n;j++)
  {
     count=a[j];
      if(i==count)
      {
        found++;
      }
    }
    printf("%d %d\n",i,found);
  }
  return 0;
}