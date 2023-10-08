#include<iostream>
using namespace std;
int main()
{
//	int x;
//	cout<<"enter the number:"<<endl;
//	cin>>x;
//	for(int i=1;i<=10;i++)
//	{
//		cout<<i<<"*"<<x<<"="<<i*x<<endl;
//	}
int i;
int x;
int fact=1;
cin>>x;
int y=x;
for(i=1;i<=x;i++)
{
	
	fact=fact*y;
	y--;
}
cout<<endl<<fact;
return 0;
}
