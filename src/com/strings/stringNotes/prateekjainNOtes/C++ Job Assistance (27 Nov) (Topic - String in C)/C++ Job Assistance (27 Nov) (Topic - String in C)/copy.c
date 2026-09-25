#include<stdio.h>

int main()
{
    char a[10] = "prateek" , b[10];
    int i = 0;

    while(a[i] != '\0')
    {
        b[i] = a[i];
        i++;
    }
    b[i] = '\0';

    printf("\nCopied String is %s\n",b);

    return 0;
}
