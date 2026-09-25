 #include<stdio.h>

int main()
{
    int a[] = {1,3,4,5,9,2,3,5,9,1,4};
    int hash[100] = {0} ,i;

    for(i=0 ; i< 11; i++)
        hash[a[i]]++;
    for(i=0; i<100; i++)
    {
        if(hash[i] == 1)
        {
            printf("%d --> %d\n",i,hash[i]);
        }
    }

    return 0;
}
