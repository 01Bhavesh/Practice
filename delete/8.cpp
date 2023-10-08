#include<iostream>
using namespace std;
class account
{
	int acco;
	char name[5];
	public:
		void get()
		{
			cout<<"enter the acco:"<<endl;
			cin>>acco;
			cout<<"enter the name:"<<endl;
			cin>>name;
		}
		void display()
		{
			cout<<"account details:"<<acco<<name<<endl;
		}
};
int main()
{
	int no;
	cout<<"enter the account holder:"<<endl;
	cin>>no;
	account a[no];
	for(int i=0;i<no;i++)
	{
		a[i].get();
	}
	for(int i=0;i<no;i++)
	{
		a[i].display();
	}
}
