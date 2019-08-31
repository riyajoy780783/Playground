#include<stdio.h>
int main()
{
	char str[100];
  	scanf("%[^\n]s",str);
  	int len=strlen(str),idx=0;
  	char a[2*len];
  
  	for(int i=0;str[i]!='\0';i++)
    {
      if((str[i]=='t'||'T')&&(str[i+1]=='h')&&(str[i+2]=='e'))
      {
        i=i+3;
        }
      else
      {
        a[idx]=str[i];
        idx++;
    }
    }
  a[idx]='\0';
  printf("%s",a);
  return 0;
}