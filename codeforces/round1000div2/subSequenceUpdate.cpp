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
    int n, l, r;
    cin >> n >> l >> r;
    vector<int> a(n, 0);
    for(int i = 0; i < n; i++){
        cin >> a[i];
    }
    if(n==r-l+1){
        cout << accumulate(a.begin(), a.end(), 0) << endl;
        return;
    }
    if(l==1){
        sort(a.begin(), a.end());
        cout << accumulate(a.begin(), a.begin() + r, 0) << endl;
        return;
    }
    if(r==n){
        sort(a.begin(), a.end(), greater<int>());
        cout << accumulate(a.begin() + l - 1, a.end(), 0) << endl;
        return;
    }
    if(l==r){
        cout << a[l-1] << endl;
        return;
    }
    vector<int> rightArr;
    for(int i=l-1;i<n;i++){
        rightArr.pb(a[i]);
    }
    sort(rightArr.begin(), rightArr.end());
    int rightSum = accumulate(rightArr.begin(), rightArr.begin()+(r-l+1), 0);



    vector<int> leftArr;
    for(int i=0;i<r;i++){
        leftArr.pb(a[i]);
    }
    
    sort(leftArr.begin(), leftArr.end(), greater<int>());
    int leftSum = accumulate(leftArr.begin()+l-1, leftArr.end(), 0);
    cout << min(leftSum, rightSum) << endl;
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

