#include<stdio.h>
int main()
{
int n,max;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int k;
  scanf("%d",&k);
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(a[i]<a[j])
      {
        max=a[i];
        a[i]=a[j];
        a[j]=max;
      }
    }
  }
 
    printf("%d",a[k-1]);
return 0;
}