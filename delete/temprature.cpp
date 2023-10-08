#include<iostream>
using namespace std;
class city
{
	char name[10];
	int temp[6];
	public:
		void get1()
		{
			cout<<"enter the city:"<<endl;
			cin>>name;
			cout<<"enter the temp"<<endl;
			for(int i=0;i<=6;i++)
			{
				cin>>temp[i];
			}
		}
		void display()
		{
			cout<<name;
			for(int i=0;i<=6;i++)
			{
				cout<<"day"<<i+1<<"="<<temp[i]<<endl;
			}
		}
};
int main()
{
	static int no;
	cin>>no;
	city c[no];
	for(int i=0;i<no;i++)
	{
		c[i].get1();
	}
	for(int i=0;i<no;i++)
	{
		
		c[i].display();
	}
}
