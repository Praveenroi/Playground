#include <stdio.h>
int main() {
int a,b,c=0,i;
  scanf("%d",&a);
  b=a;
  while(a!=0)
  {
    i=a%10;
    c=c+i*i*i;
    a=a/10;
  }
  if(b==c)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}