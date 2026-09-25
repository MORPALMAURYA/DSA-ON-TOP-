#include<stdio.h>
int main()
{
    int i,j;
    char c = 'A';

    for( i = 0 ; i <= 3 ; i++)
    {

        for( j = 0,c = 'A'; j <= 3+i ; j++)
        {
            if( 3-i <= j)
            {
                printf("%c",c);
                if( j < 3)
                    c++;
                else
                    c--;
            }
            else
                printf(" ");

        }
        printf("\n");
    }
    return 0;
}
