#include<iostream>
using namespace std;
template<class T,class T1>
void display(int *a,int *b)
{
	int c=*a;
	*a=*b;
	*b=c;
}
int main()
{
	int a=10;
	int b=20;
	display<int,int>(&a,&b);
	cout<<a<<b;
}

