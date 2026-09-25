#include<stdio.h>
int main()
{
    int week;
    printf("Enter day number\n");
    scanf("%d",&week);

    if(week == 0 || week == 6)
        printf("Weekend");
    else if(week == 1)
        printf("Monday");
    else if(week == 2)
        printf("Tuesday");
    else if(week == 3)
        printf("Wed");
    else if(week == 4)
        printf("Thus");
    else if(week == 5)
        printf("Fri");
    else
        printf("Invalid Day");

    return 0;

}
