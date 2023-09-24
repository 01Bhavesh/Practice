#include<iostream>
using namespace std;
class Complex
{
	public:
		Complex();
		Complex(int,int);
		friend void operator << (ostream &out,const Complex &c);
		friend void operator >> (istream &in,Complex &c);
//		void display();
	protected:
		int x,y;
};
Complex::Complex()
{
	cout<<"default values:"<<endl;
	x=y=0;
}
void operator <<(ostream &out,const Complex &c)
{
	out<<c.x;
	out<<"+"<<c.y<<"i"<<endl;
}
void operator >>(istream &in,Complex &c)
{
	cout<<"enter value of real:"<<endl;
	in>>c.x;
	cout<<"enter the imaginary:"<<endl;
	in>>c.y;
}
int main()
{
	
	Complex c1;
	cin>>c1;
	cout<<"complex object"<<endl;
	cout<<c1;
	return 0;
}

