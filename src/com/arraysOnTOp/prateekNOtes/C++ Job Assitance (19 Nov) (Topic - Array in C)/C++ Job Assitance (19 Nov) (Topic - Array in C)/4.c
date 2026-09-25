#include <stdio.h>

int main() {

   int a[] = {8,9,34,76,23,45,36},i,j;
   int t;
   for(i= 0 ; i < 6; i++)
   {
      for(j=i+1; j<7; j++)
      {
         if(a[i] > a[j])
         {
            t = a[i];
            a[i] = a[j];
            a[j] = t;
         }
      }
   }

   for(i = 0 ; i<7 ; i++)
   {
      printf("%d ",a[i]);
   }


   return 0;
}
