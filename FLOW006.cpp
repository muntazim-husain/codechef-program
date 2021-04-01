#include <iostream>
using namespace std;
int main() {
	int t;	
	cin>>t;
	while(t--)
	{
	    int x,y,sum=0;
	    cin>>x;
	    while(x>0)
	    {
	        y=x%10;
	        sum=sum+y;
	        x=x/10;
	    }
	    cout<<sum<<endl;
	}
	return 0;
}
