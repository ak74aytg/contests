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

void solve(){
    string s;
    cin >> s;
    string og = "ADVITIYA";
    int sum = 0;
    for(int i=0;i<8;i++){
        int diff = og[i] - s[i];
        if(diff<0) diff += 26;
        sum += diff;
    }
    cout << sum << endl;
    return;
}

int main(){
    int t;
    cin >> t;
    while(t-->0){
        solve();
    }
    return 0;
}

