#include<iostream>
using namespace std;
int main()
{
//	int x;
//	cout<<"enter"<<endl;
//	cin>>x;
//	
//	for(int i=2;i<x;i++)
//	{
//		int flag=0;
//		for(int j=2;j<i/2;j++)
//		{
//			if(i%j==0)
//			{
//				flag=1;
//			}
//		}
//		if(flag==1)
//			cout<<"not"<<i<<endl;
//		else
//			cout<<"prime"<<i<<endl;
//	}
int x;
cout<<"enter "<<endl;
cin>>x;
int a=0;
int b=1;
cout<<a<<" "<<b<<" ";
for(int i=3;i<=x;i++)
{
	int tem=a;
	a=b;
	b=a+tem;
	cout<<b<<" ";
}
}
