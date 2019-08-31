/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int n,sum=0,add=0,i;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n/2;i++)
  {
    sum=sum+a[i];
  }
   for(i=n/2;i<n;i++)
  {
    add=add+a[i];
  }
  
  if(sum==add)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  return 0;
}