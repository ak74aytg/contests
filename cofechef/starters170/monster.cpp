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

void solve() {
    int n, x;
    cin >> n >> x;
    vector<ll> h(n);
    for(int i = 0; i < n; i++) cin >> h[i];
    
    sort(h.begin(), h.end(), greater<int>());
    ll ans = 0;
    for(ll i=0;i<n;i++){
        ans = max(ans, h[i] + i*x);
    }
    cout << ans << endl;
    return;
}

int main() {
    int t;
    cin >> t;
    while(t--) solve();
    return 0;
}