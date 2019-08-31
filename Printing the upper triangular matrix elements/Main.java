#include <stdio.h>
int main()
{
int n1,n2;
scanf("%d %d",&n1,&n2);

int mat[n1][n2];
  
int i, j,k,m;
for(i = 0; i < n1; i++)
{
  for(j = 0; j < n2; j++)
  {
       scanf("%d",&mat[i][j]);
}
}

 for (j = 0; j < n2; j++)
  {       
     for(k=0,m=j;m<n2;k++,m++)
     {
       printf("%d ",mat[k][m]); 
      }
  
}
 
return 0;
}