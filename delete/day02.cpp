#include<iostream>
using namespace std;
static int i;
int main()
{
	int fixAmount=100;
	int no;
	cout<<"enter the index:"<<endl;
	cin>>no;
	int arr[no];
	cout<<"enter array:";
	for(i=0;i<no;i++)
	{
		cin>>arr[i];
	}
	
	int sum=0;
	int count=0;
	int sequence;
	for(i=0;i<no;)
	{
		start:
		sum=arr[i]+sum;
		if(sum<=100)
		{
			count++;
//			cout<<arr[i]<<"  ";	
			if(i==no-1)
			{
				break;
			}
		}
		else
		{
			if(count>sequence)
			{
				sequence=count;
			}
			i--;
			sum=0;
			count=0;
			goto start;
		}
		i++;
	}
	cout<<"sequence:"<<sequence;
}
