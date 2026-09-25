#include<stdio.h>

void rightRotation(int a[],  int size , int d)
{
    int i,j,x;

    for(i = 1 ; i<= d ; i++)
    {
        x = a[size-1];
      for( j = size-1 ; j > 0 ; j--)
      {
        a[j] = a[j-1];
      }
        a[0] = x;
    }

    for(i = 0 ; i<size ; i++)
    {
        printf("%d ",a[i]);
    }
    printf("\n\n");
}

int main()
{
    int a[] = {1,2,3,4,5,6,7,8,9};

    rightRotation(a,9,3);

    return 0;
}
