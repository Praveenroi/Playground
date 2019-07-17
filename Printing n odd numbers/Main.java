#include <stdio.h>
int main() {
  int a,i,c=1;
  scanf("%d",&a);
  for(i=1;c<=a;i++)
  {
    if(i%2==1)
    {
      printf("%d\n",i);
      c++;
    }
  }

	return 0;
}