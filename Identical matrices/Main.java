#include<stdio.h>
int main()
{
	 int r,flag=0;
    int c;
    scanf("%d", &r);
    scanf("%d", &c);
    int matrix[r][c];
    
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        scanf("%d", &matrix[i][j]);
      }
    }
  int matrix2[r][c];
  for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        scanf("%d", &matrix2[i][j]);
      }
    }
 for(int i = 0; i < r; i++)
    {
   
      for(int j = 0; j < c; j++)
      {
        if(matrix[i][j]!=matrix2[i][j])
        {
          flag=1;
          break;
        }
      }
    }
  if(flag==1)
  {
    printf("No");
  }
  else
  {
    printf("Yes");
  }
  
	return 0;
}