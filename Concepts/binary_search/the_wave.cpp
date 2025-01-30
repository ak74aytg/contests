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
#define pos cout << "POSITIVE" << endl;
#define neg cout << "NEGATIVE" << endl;
#define zero cout << "0" << endl;



/*
Chef is stuck in the wavey world of polynomials. You are given all N roots of a polynomial 
P(x)=∏ (x−a). 
The roots are pairwise distinct integers, but they are not given in any particular order.
To help Chef escape, you should answer Q queries (numbered 1 through Q). For each valid i, in the i-th query, 
you are given an integer 
xi and you have to determine whether 
P(xi) is positive, negative or 0.
*/


void solve(int n, int x, vector<int> &a){
    int low = 0;
    int high = n-1;
    while(low<=high){
        int mid = low + (high-low)/2;
        if(a[mid] == x){
            zero
            return;
        }
        if(a[mid]>x){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
    }
    if((n-low) & 1 ^ 1) {
        pos;
    }else{
        neg;
    }
}

int main(){
    int n, q;
    cin >> n >> q;
    vector<int> a(n);
    for(int i=0;i<n;i++) cin >> a[i];
    sort(a.begin(), a.end());
    for(int i=0;i<q;i++){
        int x;
        cin >> x;
        solve(n, x, a);
    }
    return 0;
}