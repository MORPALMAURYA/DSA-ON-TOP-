#include<stdio.h>

int fact(int n)
{
    if( n == 1)
        return 1;

    return n*fact(n-1);
}
int main()
{
    int n = 6 , f;

    f = fact(n);

    printf("Factorial is %d is %d\n\n",n,f);
    return 0;
}
