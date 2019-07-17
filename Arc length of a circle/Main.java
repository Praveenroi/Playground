#include<stdio.h>
int main()
{
  float r,b,a;
  scanf("%f",&r);
  scanf("%f",&a);
  b=2*3.14*r*(a/360.0);
  printf("%.2f",b);
}