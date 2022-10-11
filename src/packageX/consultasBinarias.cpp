#include <bits/stdc++.h>
using namespace std;

void solve(){
	int q,n; cin>>n>>q;
	vector<int> arr(n);
	for(int i=0; i < n; i++){
		cin>>arr[i];
	}
	while(q--){
		int type; cin>>type;
		if(type){
			int pos; cin>>pos;
			arr[pos - 1] = !arr[pos - 1]; 
		}else{
			int l,r; cin>>l>>r;
			
			if(arr[r-1] & 1) cout<<"ODD"<<endl;
			else cout<<"EVEN"<<endl;
		}
	}
}

int main(){
    ios::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);
    
    int t = 1; 
    while(t--){
        solve();
    }
    return 0;
}