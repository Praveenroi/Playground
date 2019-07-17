#include<stdio.h>
int main()
{
int a,b,c;
  scanf("%d\n\n%d\n\n%d",&a,&b,&c);
  if(a>b && a<c || a<b && a>c)
  {
    printf("%d",a);
  }else if(b>c && b<a || b<c && b>a)
  {
    printf("%d",b);
  }else if(c>a && c<b || c<a && c>b)
  {
    printf("%d",c);
  }
}