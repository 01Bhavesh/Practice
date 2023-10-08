#include<iostream>
using namespace std;
void sorting(int*);
int main()
{
	int ptr[5];
	int* ptr1[5];
	cout<<"enter the 5 number:"<<endl;
	for(int i=0;i<5;i++)
	{
		cin>>ptr[i];
	}
	for(int i=0;i<5;i++)
	{
		ptr1[i]=&ptr[i];
	}
	sorting(ptr);
	cout<<"pritting values:";
		for(int i=0;i<5;i++)
	{
		cout<<ptr[i]<<endl;
	}
	return 0;
}


void sorting(int ptr[5])
{
	for(int i=0;i<5;i++)
	{ 
		for(int j=i+1;j<5;j++)
		{
			if(ptr[i] > ptr[j])
				{
					int tem=ptr[i];
					ptr[i]=ptr[j];
					ptr[j]=tem;
				}
		}
	}
}
