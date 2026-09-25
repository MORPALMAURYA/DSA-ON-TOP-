#include<stdio.h>
#include<string.h>
int main()
{
    char a[] = "NITINa";

    int i = 0 , j = strlen(a)-1;

    while(i<=j)
    {
        if(a[i] == a[j])
        {
            i++;
            j--;
        }
        else{
            break;
        }
    }

    if(i>j)
        printf("Palindrome\n");
    else
        printf("Not Palindrome\n");

    return 0;
}
