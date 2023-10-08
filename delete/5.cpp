#include<iostream>
using namespace std;
void display(int =2,char ='@');
int main()
{
	cout<<"default:"<<endl;
	display();
	cout<<"\nparameterization"<<endl;
	display(5,'*');
	cout<<"\npara"<<endl;
	display(3,'$');
}
void display(int x,char y)
{
	for(int i=1;i<=x;i++)
	{
		cout<<y;
	}
}
