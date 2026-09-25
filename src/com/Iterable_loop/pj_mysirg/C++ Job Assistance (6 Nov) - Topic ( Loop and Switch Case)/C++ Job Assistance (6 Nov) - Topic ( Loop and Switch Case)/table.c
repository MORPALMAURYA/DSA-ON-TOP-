#include<stdio.h>
int main()
{
    int i , n;
    printf("Enter a number \n");
    scanf("%d",&n);

    for(i=1; i<= 10 ; i++)
    {
        if( n == 5 && i == 6)
            continue;
        printf("%d x %d = %d\n",n,i,i*n);
    }
    return 0;

}
