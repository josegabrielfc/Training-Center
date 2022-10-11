#include <bits/stdc++.h>
using namespace std;

int transponer = 0;
int decr= 0;
int inc = 0;

void changeRows(vector<vector<int>> &matrix, int &a, int &b){
	for(int i = 0; i < matrix.size(); i++) swap(matrix[a-1][i], matrix[b-1][i]);
}

void changeColumns(vector<vector<int>> &matrix, int &a, int &b){
	for(int i = 0; i < matrix.size(); i++) swap(matrix[i][a-1], matrix[i][b-1]);
}

void update(vector<vector<int>> &matrix){
	int n = matrix.size();
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++) {
			matrix[i][j] += inc - decr;
		}
	}
}

void transposition(vector<vector<int>> &matrix){
	if(!(transponer & 1)) return;
	int n = matrix.size();
	for(int i = 0; i < n; i++){
		for(int j = 0; i+j < n; j++) {
			swap(matrix[i+j][j], matrix[j][i+j]);
		}
	}
}

void solve(){
	int n; cin>>n;
	
	transponer = inc = decr = 0;
	
	vector<vector<int>> matrix(n, vector<int>(n));
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++) {
			char c; cin>>c;
			matrix[i][j] = c - '0';
		}
	}
	
	int q; cin>>q;
	
	while(q--){
		string oper; cin>>oper;
		if(oper == "fila"){
				int a,b; cin>>a>>b;
				changeRows(matrix, a, b);
		}else if(oper == "columna"){
				int a,b; cin>>a>>b;
				changeColumns(matrix, a, b);
		}else if(oper == "inc") inc++;
		else if(oper == "dec") decr++;
		else transponer++;
	}
	
	update(matrix);
	transposition(matrix);
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++) {
			cout<<matrix[i][j];
		}
		cout<<endl;
	}
	cout<<endl;
}

int main() {
	int t; cin>>t;
	for(int i = 1; i <= t; i++){
		cout<<"Case #"<<i<<endl;
		solve();
	}
	return 0;
}