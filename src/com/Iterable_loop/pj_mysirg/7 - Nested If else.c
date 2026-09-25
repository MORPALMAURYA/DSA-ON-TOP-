#include<stdio.h>
int main()
{
    int x=1, y=2, z=3;

    if( x == 1 )
    {
       printf(" if x == 1\n");

       if(y == 2)
       {
         printf(" if x == 1 and if y == 2\n");
       }
       else
       {
         printf(" if x == 1 and y != 2\n");
       }
    }
    else
    {
        printf(" if x != 1");
        if(z == 3)
        {
            printf(" if x != 1 and z == 3");
        }

    }

    return 0;
}
