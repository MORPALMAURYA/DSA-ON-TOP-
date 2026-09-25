#include<stdio.h>
int main()
{
    int i,j,n;

    for(i=0 ; i<= 10 ; i++)
    {
        for(j=0 ; j<= 10 ; j++)
        {
            if(j >= 10-i)
                printf("*");
            else
                printf(" ");
        }
        printf("\n");
    }

    return 0;
}
