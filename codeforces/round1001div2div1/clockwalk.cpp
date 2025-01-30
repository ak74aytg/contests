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
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin >> a[i];
    }
    bool flag = false;
    for(int pos = 0;pos<n;pos++){
        if(a[pos] <= 2 * max(pos, n-pos-1)){
            flag = true;
            break;
        }
    }
    if(flag) cout << "NO" << endl;
    else cout << "YES" << endl;
}

int main(){
    int t;
    cin >> t;
    while(t-->0){
        solve();
    }
    return 0;
}

