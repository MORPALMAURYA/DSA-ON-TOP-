4#include<stdio.h>

int main()
{
    int a[5] = {3,5,2,55,12},i,max;

    max = a[0];
    for(i= 1 ; i<5 ; i++)
    {
        if(max < a[i])
        {
            max = a[i];
        }
    }
    printf("Maximum value is %d\n\n",max);
    return 0;
}
