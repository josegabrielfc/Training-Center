#include <bits/stdc++.h>
using namespace std;

void solve(){
	int h, w, x, y; cin>>h>>w>>x>>y;
	h++;
	x++;
	w+=3;

	vector<vector<char>> matrix(h, vector<char>(w, ' '));
	
	for(int i = 1; i < w - 1; i++) matrix.front()[i] = matrix.back()[i] = '_';
	for(int i = 1; i < h; i++) matrix[i].front() = matrix[i].back() = '|';
	
	for(int i = 1; i < w - 1; i++) matrix[y][i] = '_';
	for(int i = 1; i < h; i++) matrix[i][x] = '|';
	
	matrix[0][x] = ' ';
	matrix[0].pop_back();
	
	
	for(int i = 0 ; i < h; i++){
		for(char c: matrix[i]){
			cout<<c;
		}
		cout<<endl;
	}
	cout<<endl;
}

int main() {
	int t; cin>>t;
	for(int i = 1; i <= t; i++){
		solve();
	}
	return 0;
}
                              