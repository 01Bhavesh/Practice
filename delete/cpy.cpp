#include<iostream>
using namespace std;//strlen,strcpy,strconcating
int main()
{
char a[20];
char* b[20];
cin>>a;
static int i=0;
	while(a[i]!='\0')
	{
		i++;
	}
	static int j=0;
	while(i>=0)
	{
		b[j]=a[i];
		j++;
		i--;
	}
	b[j]='\0';
cout<<b;
//cout<<a;
return 0;
}
