#include<stdio.h>

int main()
{
  char str[100],rev[100];
  scanf("%[^\n]s",str);
  int l=strlen(str);
  int m=l-1;
  for(int i=0;i<l;i++)
  {
    rev[i]=str[m];
    m--;
  }
  float c=strcmp(str,rev);
  if(c==0)
  {
    printf("%s is a palindrome",str);
  }
  else
  {
    printf("%s is not a palindrome",str);
  }
  return 0;
}