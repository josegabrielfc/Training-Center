#include <bits/stdc++.h>
using namespace std;

struct SqrtDescomposition{
	vector<int> buckets;
	vector<int> arr;
	int N;
	int size;
	
	SqrtDescomposition(vector<int> &arr){
		this->arr = arr;
		N = sqrt(arr.size()) + 1;
		size = arr.size();
		buckets = vector<int>(N, 0);
		
		for(int i = 0; i < size; i++)
			buckets[i/N] += arr[i] & 1;
	}
	
	void update(int pos, int val){
		buckets[pos/N] += (val & 1) - (arr[pos] & 1);
		arr[pos] = val;
	}
	
	int query(int l, int r){
		int bucket_l = l / N;
		int bucket_r = r / N;
		
		int ans = 0;
		if(bucket_l == bucket_r){
			for(int i = l; i <= r; i++){
				ans += (arr[i] & 1);
			}
		}else{
			for(int i = l; i <= (bucket_l+1) * N - 1; i++){
				ans += (arr[i] & 1);
			}
			
			for(int i = bucket_l + 1; i <= bucket_r - 1 ; i++){
				ans += buckets[i];
			}
			for(int i = bucket_r * N; i <= r; i++){
				ans += arr[i] & 1;
			}
			
		}
		
		return ans;
	}
	
};

int main() {
	int N; cin>>N;
	vector<int> arr(N);
	
	for(int i = 0; i < N; i++) cin>>arr[i];
	
	SqrtDescomposition sqr = SqrtDescomposition(arr);
	int Q; cin>>Q;
	
	while(Q--){
		int type; cin>>type;
		
		if(type==0){
			int pos, val; cin>>pos>>val;
			sqr.update(pos-1, val);
		}else if(type == 1){
			int l, r; cin>>l>>r;
			cout<<(r-l + 1 - sqr.query(l-1, r-1))<<endl;
		}else if(type == 2){
			int l, r; cin>>l>>r;
			cout<<sqr.query(l-1, r-1)<<endl;
		}
	}
	
	return 0;
}