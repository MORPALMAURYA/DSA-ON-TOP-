#include<stdio.h>

void findMax(int x[] , int size)   // int x[] = a  ==> int *x = a;
{
    int i, max = 0;

    for(i=0; i < size ; i++)
    {
        if(max < x[i])
            max = x[i];
    }

    printf("Max is %d\n\n",max);
}

int main()
{
    int a[] =  {2,4,5,1,3}, i;

    findMax(a,5);

    return 0;
}
