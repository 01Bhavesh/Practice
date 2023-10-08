#include<iostream>
using namespace std;
//class Complex
//{
//	int real,img;
//	public:
//		void get1()
//		{
//			cout<<"enter the numbers"<<endl;
//			cin>>real>>img;
//		}
//		void display()
//		{
//			cout<<real<<"+"<<img<<"i"<<endl;
//		}
//};
//int main()
//{
//	int n;
//	cout<<"enter number of objects:"<<endl;
//	cin>>n;
//	Complex* ptr=new Complex[n];	
//	for(int i=0;i<=n;i++)
//	{
//		ptr[i].get1();
//	}
//	for(int i=0;i<=n;i++){
//		ptr[i].display();
//	}
//	delete[] ptr;
//}
class add
{
	int num;
	public:
		void sum()
		{
			cout<<"enter"<<endl;
			cin>>num;
		}
		void display()
		{
			cout<<"value:"<<num;
		}
		add addition(add &b)
		{
			this->num=this->num+(b.num);
			return *(this);
		}
};
int main()
{
	add n1,n2;
	n1.sum();
	n2.sum();
	add n3=n1.addition(n2);
	n3.display();
}
