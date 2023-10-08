//#include<iostream>
//using namespace std;//strlen,strcpy,strconcating
//void userdef(char* a,char* b);
//int main()
//{
//	string str;
//	cout<<"enter the string:"<<endl;
//	cin>>str;
//	int i=0;
//	while(str[i]!='\0')
//	{
//		i++;
//	}
//	cout<<"lenght:"<<i<<endl;
//}
#include<iostream>
using namespace std;
int main()
{
	char a[20];
	char b[20];
	cin>>a;
	int i=0;
	while(a[i]!='\0')
	{
		i++;
	}
	cout<<i;
	for(i;i>=0;i--)
	{
		cout<<a[i];
	}
}







