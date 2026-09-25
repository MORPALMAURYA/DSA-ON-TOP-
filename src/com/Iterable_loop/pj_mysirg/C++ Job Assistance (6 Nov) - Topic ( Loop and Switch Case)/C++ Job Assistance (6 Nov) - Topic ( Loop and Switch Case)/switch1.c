#include<stdio.h>
int main()
{
    int n;

    printf("Enter a number \n");
    scanf("%d",&n);

    switch(n)
    {
        case 1 :
                printf("Sunday");
                break;

        case 2 :
                printf("Monday");
                break;

        case 3 :
                printf("Tuesday\n");
                break;
        case 4 :
                printf("Wednesday\n");
                break;

        case 5 :
                printf("Thursday\n");
                break;

        case 6 :
                printf("Friday\n");
                break;

        case 7 :
                printf("Saturday\n");
                break;
        default :
                printf("Invalid Input\n");
    }

    return 0;
}
