#include<stdio.h>
int main()
{
   int r,c;

   for( r = 0; r < 4 ; r++)
   {
     for(c = 0 ; c <3 ; c++)
     {
        printf("%d",r+1);
     }
       printf("\n");
   }

   printf("\n\n");

for( c = 0; c < 4 ; c++)
   {
     for(r = 0 ; r < 3 ; r++)
     {
        printf("%d",r+1);
     }
       printf("\n");
   }


 return 0;
}
