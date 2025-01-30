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
    ll high = n;
    ll low = 0;
    
    while(low<=high){
        ll mid = low + (high-low)/2;
        ll coins = (mid * (mid + 1))/2;

        if(coins <= n){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
    }
    cout << low-1 << endl;
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

