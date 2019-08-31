#include<stdio.h>
int main()
{
	char str[100];
  	int i,j;
  	scanf("%[^\n]s",str);
  	int len=strlen(str);
  int flag=0;
  	for(i=0;i<len;i++)
    {
      flag=0;
      for(j=0;j<len;j++)
      {
        if(str[i]==str[j] && (i!=j))
        {
          flag=1;
         }
       }
        if(flag==0)
      {
        printf("%c",str[i]);
        break;
      }
    }
 if(flag==1)
  {
    printf("All the characters are repetitive");
  }    
	return 0;
}