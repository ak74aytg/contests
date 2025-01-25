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


void Solve(){
    int l, r;
    cin >> l >> r;
    if (l == r && l == 1) cout << 1 << endl;
    else cout << r - l << endl;
}

int main(){
    int t;
    cin >> t;
    while(t-->0){
        Solve();
    }
    return 0;
}
