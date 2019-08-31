#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int a[], int n, int sum);
int main()
{
   int n;
  scanf("%d",&n);
  int a[n];
  for(int i=1;i<=n;i++)
  {
    scanf("%d",&a[i]);
  }
  int sum;
  scanf("%d",&sum);
  check_sum_and_display(a,n,sum);
 }
void check_sum_and_display(int a[], int n, int sum)
{
  int s,i,j;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      s=a[i]+a[j];
       if(s==sum)
      {
        printf("Perfect couple: %d %d",a[i],a[j]);
         exit(0);
        }
      
      }
   
   }
  printf("No perfect couple found!");
}