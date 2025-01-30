#include <iostream>
#include <stack>
#include <queue>
#include <algorithm>
#include <unordered_map>
#include <map>
#include <unordered_set>
#include <set>
#include <vector>
#include <cmath>
#include <climits>
#include <numeric>
#include <deque>
#include <array>

using namespace std;

#define ll long long
#define pb push_back

void solve() {
    int n;
    cin >> n;
    string s;
    cin >> s;

    // Possible patterns for the wall
    string pattern1 = "RGB";
    string pattern2 = "GBR";
    string pattern3 = "BRG";
    string pattern4 = "GRB";
    string pattern5 = "BGR";
    string pattern6 = "RBG";

    string patterns[] = {pattern1, pattern2, pattern3, pattern4, pattern5, pattern6};

    int min_cost = INT_MAX;

    for (int p = 0; p < 6; p++) {
        string pattern = patterns[p];
        int cost = 0;

        for (int i = 0; i < n; i++) {
            if (s[i] != pattern[i % 3]) {
                cost++;
            }
        }
        min_cost = min(min_cost, cost);
    }

    cout << min_cost << endl;
}

int main(){
    int t;
    cin >> t;
    while(t-->0){
        solve();
    }
    return 0;
}

