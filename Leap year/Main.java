#include<stdio.h>
int main()
{
  int year;
  scanf("%d",&year);
  if((year%400==0)||(year%4==0)&&(year%100!=0))
    printf("Leap year");
  else
    printf("Not Leap year");
  //Type your code here
  return 0;
}