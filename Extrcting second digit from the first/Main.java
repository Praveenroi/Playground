#include <stdio.h>
int main() {
	int a,r,i;
  scanf("%d",&a);
  while(a!=0)
  {
    i=a%10;
    r=r*10+i;
    a=a/10;
  }
  r=r%100;
  r=r/10;
  printf("%d",r);
	return 0;
}