#include<stdio.h>

int  main()
{
    char name[5][20];
    int i,j,count = 0;

    printf("Enter 5 names\n");
    for(i=0 ; i <5 ; i++)
        gets(name[i]);

    for( i = 0; i <5 ; i++)
    {
        for(j = 0; name[i][j] != '\0' ;j++ )
        {
            if(name[i][j] == 'a')
                count++;
        }
    }

    printf("\nNumber of a = %d\n",count);
    return 0;
}
