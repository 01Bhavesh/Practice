#include<iostream>
using namespace std;
int main()
{
	int m,n;
	int sum=0;
	cout<<"enter the number od subject"<<endl;
	cin>>m;
	cout<<"enter the char"<<endl;
	cin>>n;
	int* no=new int[m];
	char* name=new char(n+1);//()
	cout<<"enter the marks:";
	for(int i=0;i<m;i++)
	{
		cin>>no[i];
		sum=sum+no[i];
	}
	float x=(float)sum/m;
	cout<<"enter student name:"<<endl;
	cin>>name;
	cout<<"name="<<name<<"="<<x;
	delete[] name;
	delete[] no;
	return 0;
}
