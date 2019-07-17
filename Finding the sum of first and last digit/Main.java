#include <stdio.h>
int main() {
	int a,r=0,t=0,i;
  scanf("%d",&a);
  t=a%10;
  while(a!=0)
  {
    i=a%10;
    r=r*10+i;
    a=a/10;
  }
  r=r%10;
  printf("%d",t+r);
	return 0;
}