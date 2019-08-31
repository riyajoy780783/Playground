#include <stdio.h>
int main() {
	int n1,n2,n3;
  	scanf("%d %d %d",&n1,&n2,&n3);
  	printf("%d",gcd(n1,n2,n3));
	return 0;
}
int gcd(int a,int b,int c)
{
  int g,gr,gcd;
  if(a>b)
    g=b;
  else
    g=a;
  if(g>c)
    gr=c;
  else
    gr=g;
  while(gr>=1)
    if((a%gr==0)&&(b%gr==0)&&(c%gr==0))
    {
      gcd=gr;
 	 break;
    }
  else
  {
    gr--;
  }
  return gr;
}