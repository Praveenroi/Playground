#include<stdio.h>
int main()
{
long int a,b=1,i=1;
  scanf("%ld",&a);
  while(i<=a)
  {
    b=b*i;
    i++;
  }
  printf("%ld",b);
}