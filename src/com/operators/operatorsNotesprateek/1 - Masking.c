// WAP to set 3rd bit from RHS
#include<stdio.h>
int main()
{
    int x;
    printf("Enter a number\n");
    scanf("%d",&x);

   // x = x|4;

    printf("Final Number is %d\n",x);

   // (x&3) == 3 ? printf("Yes\n") : printf("No\n");

    x = x | 3;
    printf("Result = %d ",x);

    return 0;
}
