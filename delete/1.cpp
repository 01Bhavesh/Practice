#include<iostream>
#include<string.h>
using namespace std;
void uconcat(char* a,char* b);
int main()
{
	char a[20];
	char b[10];
	cout<<"entre the string:"<<endl;
	cin>>a>>b;
	uconcat(a,b);
	cout<<"value:"<<a;
//	char a='x';
//	char* b=&a;
//	char** c= &b;
//	cout<<sizeof(b)<<" "<<sizeof(**c)<<" "<<sizeof(*c);	
}
void uconcat(char* a,char* b)
{
	while(*++a);
	while(*a++=*b++);
}
