#include<stdio.h>

int main()
{
    char a[] = "prateek";
    int i,count = 0;

    for(i=0 ; a[i] != '\0' ; i++)
    {
        if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u')
            count++;
    }
    printf("Number of vowels is %d\n",count);

    return 0;
}
