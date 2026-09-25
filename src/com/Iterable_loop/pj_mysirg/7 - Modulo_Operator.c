#include<stdio.h>
int main()
{
    int x = 50 , y = 18,z = 10, max;

    max = (x > y)? ((x>z) ? x : z ): ((y>z) ? y : z) ;

    printf("Maximum is %d ",max);

    return 0;
}
