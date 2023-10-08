#include<iostream>
using namespace std;
#include<string.h>
class string1
{
	int num;
	char* ch;
	public:
		string1(char*);
		string1(char,int);
		string1(int);
		string1();
		void display();
};
void string1::display()
{
	cout<<"len="<<num<<" "<<"string="<<ch<<endl;
}
string1::string1(char* a)
{
	num=strlen(a);
	ch=new char(num+1);
	strcpy(ch,a);
}
string1::string1(int a)
{
	num=a;
	ch=new char(a+1);
	char* str=new char(num+1);
	cout<<"enter the string:"<<endl;
	cin>>str;
	strcpy(ch,str);
}
string1::string1(char ch,int a)
{
	num=a;
	int i;
	this->ch=new char[num+1];
	for(i=0;i<num;i++)
	{
		this->ch[i]=ch;
	}
	this->ch[i]='\0';
}
string1::string1()
{
	cout<<"enter the number of char"<<endl;
	cin>>this->num;
	ch=new char[num+1];
	cout<<"enter the string:"<<endl;
	cin>>this->ch;
}
int main()
{
	string1 s1("bhavesh");
	s1.display();
	string1 s2(5);
	s2.display();
	string1 s3('*',4);
	s3.display();
	string1 s4;
	s4.display();
	
}
