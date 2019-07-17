#include <stdio.h>
int main() {
	int a,r=0,i;
  scanf("%d",&a);
  while(a!=0)
  {
    i=a%10;
    r=r+i;
    a=a/10;
  }
  printf("%d",r);
	return 0;
}