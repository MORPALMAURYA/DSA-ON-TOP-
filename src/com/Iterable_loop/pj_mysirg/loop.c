#include<stdio.h>
int main()
{

    unsigned int i,j ,k;

    for(i = 0 ; i<5 ;i++)
    {
        printf("1 ");
        for(j = 0 ;j < 5 ;j++)
        {
            printf("2 ");
            for(k = 0; k < 5 ; k++)
            {
                printf("3");
            }
            printf("4 ");
        }
            printf("5 \n\n");
    }


    return 0;
}
