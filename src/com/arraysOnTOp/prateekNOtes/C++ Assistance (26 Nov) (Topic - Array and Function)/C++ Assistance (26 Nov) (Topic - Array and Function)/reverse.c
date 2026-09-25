#include<stdio.h>

void reversePrint(int a[] , int size)
{
    int i;

    for(i = size-1 ; i>=0 ; i--)
    {
        printf("%d ",a[i]);
    }
        printf("\n\n");
}

int main()
{
    int a[] = {1,2,3,4,5,6,7,8,9};
    reversePrint(a,9);
    return 0;
}
