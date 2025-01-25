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
    int n, b;
    cin >> n >> b;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin >> a[i];
    }
    int total_water = accumulate(a.begin() ,a.end(), 0);
    if(total_water % b == 0){
        cout << total_water / b << endl;
    }else 
        cout << total_water /b +1 << endl;

}


int main(){
    int t;
    cin >> t;
    while(t-->0){
        solve();
    }
    return 0;
}

