#include<iostream>
using namespace std;
float division(int x,int y)
{
	if(y==0)
	{
		throw"error";
	}
	return (x/y);
}
int main()
{
	int x,y;
	cout<<"enter the numebr:"<<endl;
	cin>>x>>y;
	float k=0;
	try
	{
		k=division(x,y);
		cout<<k;
	}
	catch (const char*e)
		{
		cout<<e;
}

}
