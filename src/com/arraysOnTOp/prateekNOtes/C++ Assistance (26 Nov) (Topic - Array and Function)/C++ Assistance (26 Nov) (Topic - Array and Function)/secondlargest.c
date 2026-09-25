#include<stdio.h>
int main()
{
    int a[10] = {2,5,10,4,3,11,15,35,3,56};
    int  max1 = -1, max2 = -2;

    for(int i = 0 ; i<10 ; i++)
    {
            if(a[i] > max1)
            {
                max2 = max1;
                max1 = a[i];
            }
            else if(max2 < a[i])
                max2 = a[i];
    }
    printf("Second largest element is %d\n\n",max2);
    return 0;
}
