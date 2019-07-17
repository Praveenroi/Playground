#include <stdio.h>
int main() {
int a,z,b=1,c=1,d=0,i;
  scanf("%d",&a);
  z=a;
  while(a!=0)
  {
    i=a%10;
    c=1;
    while(i>=b)
    {
      c=c*i;
      i--;
    }
    d=d+c;
    a=a/10;
  }
  if(z==d)
  {
  printf("Yes");
    }
    else
    {
      printf("No");
    }
	return 0;
}