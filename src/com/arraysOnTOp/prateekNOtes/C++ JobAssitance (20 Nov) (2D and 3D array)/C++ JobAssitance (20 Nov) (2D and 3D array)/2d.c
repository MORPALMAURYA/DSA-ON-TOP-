#include<stdio.h>
int main()
{
    int a[5][4],i,j;

    int b[][4] = {1,2,3,5,6,7,8,9,10};

    int c[3][4] = { {1,2,3} , {5,6,7,8}, {9,10} };

    for(i=0; i<5; i++)
    {
        for(j=0 ; j<4 ;j++)
        {
            a[i][j] = i+j;
        }
    }

    for(i= 0 ; i<5; i++)
    {
        for(j=0 ; j<4; j++)
        {
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    printf("\n\n");
    for(i= 0 ; i<3; i++)
    {
        for(j=0 ; j<4; j++)
        {
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }
    return 0;
}
