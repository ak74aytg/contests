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
    int n;
    cin >> n;
    vector<ll> a(n);
    for(int i=0; i<n; i++){
        cin >> a[i];
    }
    ll ans = accumulate(a.begin(), a.end(), 0);
    while(a.size() > 1){
        for(int i=0;i<a.size()-1;i++){
            a[i] = a[i+1] - a[i];
        }
        a.pop_back();
        ll fSum = accumulate(a.begin(), a.end(), 0);
        ll rSum = -fSum;
        ans = max(ans, max(rSum, fSum));
    }
    cout << ans << endl;
}



int main(){
    int t;
    cin >> t;
    while(t-->0){
        solve();
    }
    return 0;
}

