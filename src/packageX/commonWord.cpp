#include <bits/stdc++.h>
using namespace std;

void solve(){
	int n; cin>>n;
	
	unordered_map<string, int> count;
	
	int highest = 0;
	while(n--){
		string word; cin>>word;
		count[word]++;
		highest = max(count[word], highest);
	}
	
	string answer = "";
	
	for(auto x: count){
		if(x.second == highest){
			if(answer == "") answer = x.first;
			else if(answer > x.first) answer = x.first;
		}
	}
	
	cout<<answer<<endl;
}

int main() {
	int t; cin>>t;
	
	while(t--){
		solve();
	}
	
	return 0;
}