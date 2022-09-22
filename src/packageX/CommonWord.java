/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageX;

import java.util.*;

/**
 *
 * @author GAMER
 */
public class CommonWord {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t > 0) {
            solve();
            t--;
        }

    }

    private static void solve() {
        HashMap<String, Integer> count;

        int n = sc.nextByte();

        int aux = n;

        int highest = 0;
        /*while (aux > 0) {
            String word = sc.next();
            count[word]++;
            highest = max(count[word], highest);
            aux--;
        }
        String answer = "";

        for (auto x : count) {
            if (x.second == highest) {
                if (answer == "") {
                    answer = x.first;
                } else if (answer > x.first) {
                    answer = x.first;
                }
            }
        }
        System.out.println(answer);
        //cout << answer << endl;*/
    }
    /*
    void solve() {
        int n;cin >> n;

        unordered_map<string, int> count;

        int highest = 0;
        while (n--) {
            string word;cin >> word;
            count[word]++;
            highest = max(count[word], highest);
        }

        string answer = "";

        for (auto x : count) {
            if (x.second == highest) {
                if (answer == "") {
                    answer = x.first;
                } else if (answer > x.first) {
                    answer = x.first;
                }
            }
        }
        cout << answer << endl;
    }

    int main() {
        int t;cin >> t;

        while (t--) {
            solve();
        }

    }
     */
}
