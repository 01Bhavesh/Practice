#include<iostream>
using namespace std;
class Student
{
	char name[10];
	int m[5];
	public:
		void get1()
		{
			cout<<"enter the name:"<<endl;
			cin>>name;
			cout<<"enter the marks"<<endl;
			for(int i=0;i<5;i++)
			{
				cin>>m[i];
			}
		}
		void display()
		{
			cout<<"name:"<<name;
			for(int i=0;i<5;i++)
			{
				cout<<m[i];
			}
		}
};
int main()
{
	static int no;
	cout<<"enter the number of student:"<<endl;
	cin>>no;
	Student s[no];
	for(int i=0;i<no;i++)
	{
		cout<<"times="<<no<<endl;
		s[i].get1();
	}
	for(int i=0;i<no;i++)
	{
		cout<<no;
		s[i].display();
	}	
	return 0;
}
