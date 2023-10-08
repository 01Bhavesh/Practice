#include<iostream>
using namespace std;
class Complex
{
	int real,img;
	
	public:
		static int count;
		Complex()
		{
			cout<<"default:"<<endl;
			real=img=0;
			count++;
		}
		Complex(int,int)
		{
			cout<<"copying data:"<<endl;
			this->real=real;
			this->img=img;
			count++;
		}
		static int getcount()
		{
			return count;
		}
};
int Complex::count=0;
int main()
{
	Complex c1(2,6);
	Complex();
	cout<<Complex::getcount()<<endl;
	cout<<Complex::count;
}
