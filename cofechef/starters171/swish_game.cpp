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
    int m, k;
    cin >> m >> k;
    string s;
    cin >> s;
    int swish = 0;
    for(int i=0;i<m;i++){
        if(s[i] == 'S'){
            swish++;
        }
    }
    if(swish >= k) cout << m << endl;
    else{
        int needed = k - swish;
        cout << m + needed - 1 << endl;
    }
}

int main(){
    int t;
    cin >> t;
    while(t-->0){
        solve();
    }
    return 0;
}

