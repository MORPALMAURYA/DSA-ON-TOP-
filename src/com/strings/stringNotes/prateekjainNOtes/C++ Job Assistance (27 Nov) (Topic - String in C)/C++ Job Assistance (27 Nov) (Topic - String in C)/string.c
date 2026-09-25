#include<stdio.h>

int main()
{
    char name[] = {'p','r','a','t','e','e','k','\0'};
    char name2[] = "jain";
    char name3[10];
    int i , length=0;

    printf("Enter your name\n");
    fgets(name3 ,10 ,stdin);

    printf("\nYour name is %s\n",name3);

    printf("%s %s",name,name2);

// WAP to find length of the string

    for(i=0 ; name[i] != '\0' ; i++)
    {
        length++;
    }

    printf("\nLength os string = %d\n",length);

    return 0;
}
