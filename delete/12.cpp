#include<iostream>
using namespace std;
//void display(int x)
//{
//	int sum=0;
//	int y=x;
//		while(x>0)
//	{	
//		int num2=x%10;
//		sum=sum+num2*num2*num2;
//		x=x/10;
//	}
//	if(y==sum)
//		cout<<"armstrom";
//	else 
//		cout<<"not";
//}
//int main()
//{
//	int x;
//	cout<<"enter the number:"<<endl;
//	cin>>x;
//	display(x);

//}
void arm(int i)
{
	int sum=0;
	int x=i;
	while(i>0)
	{
		int num1=i%10;
		sum=sum+num1*num1*num1;
		i=i/10;
	}
	if(sum==x)
	{
		cout<<x<<endl;
	}
}
int main()
{
	for(int i=1;i<=1000;i++)
	{
		arm(i);		
	}		
}
