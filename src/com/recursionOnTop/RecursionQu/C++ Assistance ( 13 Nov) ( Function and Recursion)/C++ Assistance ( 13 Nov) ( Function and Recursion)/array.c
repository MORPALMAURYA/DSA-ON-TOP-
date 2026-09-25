#include<stdio.h>
int main()
{
    int x[10] , i;

    for( i = 0; i<10 ; i++)
    {
        x[i] = 2*i;
    }

    for( i = 0; i<10 ; i++)
    {
        printf("%d ",x[i]);
    }

    return 0;
}
