/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageX;

/**
 *
 * @author GAMER
 */
public class FiveDigits {
    //Complexity O(n!)

    /*public void backtracking(int n, int k, int[] numbers,  String candidate, unordered_set<int> visited){
	if (n == k) {
            numbers.push_back(stoi(candidate));
            return;
        }

        for (int i = k > 1 ? 1 : 0; i <= 9; i++) {
            //If has been used digit i, ignore
            if (visited.find(i) != visited.end()) {
                continue;
            }

            visited.insert(i);
            candidate.push_back('0' + i);

            backtracking(n, k + 1, numbers, candidate, visited);

            candidate.pop_back();
            visited.erase(i);
        }
    }

    vector<int> numbers;

    bool compare(int i, int j) {
        int digits[
        10] = {0
        };
        if (i < 1e4) {
            digits[0] = 1;
        }
        while (i > 0) {
            digits[i % 10]++;
            i /= 10;
        }

        if (j < 1e4 && digits[0] > 0) {
            return false;
        }

        while (j > 0) {
            if (digits[j % 10] > 0) {
                return false;
            }
            j /= 10;
        }

        return true;
    }

    void solve() {
        int n;cin >> n; //Read N

        //Then, brute force all combinations 
        bool find = false;
        for (int  & i {
            
        }: numbers
        
            ){
		for (int  & j {
                
            }: numbers
            
                ){
			if (i / (j * 1.0) == n && compare(i, j)) {
                    find = true;
                    cout << "dividiendo = ";
                    if (i < 1e4) {
                        cout << "0";
                    }
                    cout << i << " y divisor = ";
                    if (j < 1e4) {
                        cout << "0";
                    }
                    cout << j << endl;
                }
            }
        }

        if (!find) {
            cout << "IMPOSIBLE" << endl;
        }
    }

    int main() {
        int t;cin >> t; //Read T
        string candidate = "";
        unordered_set<int> visited;
        backtracking(5, 0, numbers, candidate, visited);
        while (t--) { //Loop T times
            solve();
            cout << endl;
        }
        return 0;
    }*/
}
