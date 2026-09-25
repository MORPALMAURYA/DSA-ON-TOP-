#include<stdio.h>
int main()
{
    char a[] = "PrATeeK";
    int i=0;

    while(a[i] != '\0')
    {
        if((a[i] >= 'a') && (a[i] <= 'z'))
            a[i] = a[i] - 32;
        else if((a[i] >= 'A') && (a[i] <= 'Z'))
            a[i] = a[i] + 32;

        i++;
    }
    printf("\nNew String is %s\n",a);

    return 0;
}
