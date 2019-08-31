#include<stdio.h>

int main()
{
 char str[100];
  gets(str);
  int l=strlen(str);
  for(int i=l;i>0;i--)
  {
   if(str[i]==' ')
   {
     printf("%s ",&str[i+1]);
       str[i] ='\0';
   }
  }
  printf("%s",str);
  return 0;
}

