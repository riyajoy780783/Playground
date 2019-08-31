#include <stdio.h>
int main(){
	int n1,n2,n3;
  	scanf("%d %d %d",&n1,&n2,&n3);
  	//great(n1,n2,n3);
   printf("%d",great(n1,n2,n3));
  return 0;
}
int great(int a,int b,int c)
{
  int g,gr;
  if(a>b)
    g=a;
  else
    g=b;
  if(g>c)
    gr=g;
  else
    gr=c;
  return gr;
}