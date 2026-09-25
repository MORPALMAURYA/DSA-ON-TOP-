#include<stdio.h>
int main()
{
    int a[3][2][3],i,j,k;

    printf("Enter 18 numbers\n");

    for(i=0 ;i<3; i++)
    {
     for(j = 0; j<2 ; j++)
     {
        for(k=0; k<3 ; k++)
        {
            scanf("%d",&a[i][j][k]);
        }
     }
    }
    printf("\n==============================\n");
    for(i=0 ;i<3; i++)
    {
     for(j = 0; j<2 ; j++)
     {
        for(k=0; k<3 ; k++)
        {
            printf("%d ",a[i][j][k]);
        }
          printf("\n");
     }
       printf("\n");
    }
    return 0;
}
