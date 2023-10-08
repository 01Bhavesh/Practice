#include<iostream>
using namespace std;
int main()
{
	int m[5];
	int sum=0;
	cout<<"enter 5 marks:"<<endl;
	for(int i=0;i<5;i++)
	{
		cin>>m[i];
		sum=sum+m[i];
	}
	float avg=(float)sum/5;
	cout<<"average:"<<avg;
	
}
