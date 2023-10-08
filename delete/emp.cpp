#include<iostream>
using namespace std;
class employee
{
	int id;
	public:
		employee()
		{
			
		}
		employee(int id)
		{
			cout<<"coping:"<<endl;
			this->id=id;
		}
		void display()
		{
			cout<<"id="<<id<<endl;
		}
		int findsalary()
		{
			return 10;
		}
		
		~employee()
		{
			cout<<"destructor:"<<endl;
		}
		
};
class wagesemployee:public employee
{
	int hrs,rate;
	public:
		wagesemployee();
		wagesemployee(int hrs,int rate,int id):employee(id)
		{
			this->hrs=hrs;
			this->rate=rate;
		}
		void display()
		{
			cout<<this->hrs<<" "<<this->rate;
		}
		int findsalary()
		{
			return this->hrs*this->rate;
		}
		~wagesemployee()
		{
			
		}
};

int main()
{
	employee* ptr=new employee();
	employee e1;
	ptr=&e1;
	cout<<ptr->findsalary()<<endl;
	wagesemployee w1(4,25,2);
	w1.display();
	cout<<"salary:"<<w1.findsalary()<<endl;
	ptr=&w1;
	cout<<"salary:"<<ptr->findsalary();	
}
