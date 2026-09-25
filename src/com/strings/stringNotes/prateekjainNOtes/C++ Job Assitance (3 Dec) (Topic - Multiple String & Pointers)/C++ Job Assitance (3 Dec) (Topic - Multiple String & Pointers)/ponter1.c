#include<stdio.h>

int main()
{
    int x = 5;
    char a = 'b';

    int *p = &x;
    char *q = &a;

    printf("Value at x = %d , Address of x = %p\n",*&x,&x);
    printf("Value at x == *p = %d , Address of x == p = %p\n",*p,p);

    printf("Value at a = %c , Address of a = %p\n",a,&a);
    printf("Value at a == *q = %c , Address of a == q = %p\n",*q,q);

    return 0;
}
