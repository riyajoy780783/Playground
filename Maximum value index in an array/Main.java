// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
 int n,i,max,idx;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  if(a[0]>a[1])
    max=a[0];
  else
    max=a[1];
  for(int i=2;i<n;i++)
  {
   if(max>a[i])
   {
     max=a[i]; 
   }
    if(max=a[i])
    idx=i; 
  }
 printf("%d",idx);
  
   return 0;
}