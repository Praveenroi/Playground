#include<stdio.h>
int main()
{
int a,b,c;
  scanf("%d",&a);
  c=a%10;
  b=a/100;
  printf("%d",c+b);
  
  return 0;
}