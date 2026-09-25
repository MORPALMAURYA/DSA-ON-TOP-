#include<stdio.h>
int main()
{
    int a[2][2] = {1,2,3,4};
    int b[2][2] = {2,1,4,3};
    int c[2][2] , sum,i,j,k;

    for(i=0 ; i<2 ; i++)
    {
        for(j = 0 ; j<2; j++)
        {
            sum = 0;

            for(k=0 ; k<2; k++)
            {
                sum = sum + a[i][k] * b[k][j];
            }
            c[i][j] = sum;
        }
    }

    for(i=0 ; i<2 ; i++)
    {
        for(j = 0 ; j<2; j++)
        {
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }
    return 0;
}
