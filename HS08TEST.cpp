#include <iostream>
#include <iomanip>
using namespace std;

int main() {
	int x;
	float y;
	cin>>x>>y;
    float ans;
	if(x%5==0 && (x+0.5)<=y){
	    ans=y-x-0.50;
	    cout<<ans<<endl;
	}
	else{
	    cout<<y<<endl;
	}
	return 0;
}