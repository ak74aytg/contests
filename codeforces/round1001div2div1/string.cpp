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
    int count = 0;
    for(int i=0;i<s.size();i++){
        if(s[i]=='1'){
            count++;
        }
    }
    cout << count << endl;
}

int main(){
    int t;
    cin >> t;
    while(t-->0){
        solve();
    }
    return 0;
}

