#include<iostream>
using namespace std;
int fun(int* a,int* b);
int main()
{
	int len,ben;
	cout<<"enter the velue of len & ben:"<<endl;
	cin>>len>>ben;
	int area=fun(&len,&ben);
	cout<<"ans:"<<area;
}
int fun(int* a,int* b)
{
	return *a**b;
}
