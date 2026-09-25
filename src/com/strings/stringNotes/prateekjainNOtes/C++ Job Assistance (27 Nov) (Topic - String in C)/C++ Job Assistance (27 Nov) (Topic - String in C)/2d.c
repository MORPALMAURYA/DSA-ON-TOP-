#include<stdio.h>
void print(int x[][3], int row,int col)
{
    int i,j;
    for(i =0 ; i < row ; i++)
    {
        for(j = 0; j <col ; j++)
        {
            printf("%d ",x[i][j]);
        }
        printf("\n");
    }
}
int main()
{
    int a[][3] = { 1,2,3,4,5,6,7,8,9,10};

    print(a,4,3);

    return 0;
}
