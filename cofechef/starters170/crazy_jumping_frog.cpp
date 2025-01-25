#include <iostream>
#include <vector>
#include <unordered_set>
#include <string>
#include <algorithm>

using namespace std;

#define ll long long

void solve() {
    int n;
    cin >> n;
    vector<int> a(n);
    string state;


    int evenCount = 0;
    int oddCount = 0;
    for (int i = 0; i < n; i++) {
        cin >> a[i];
        if (a[i] % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }

    cout << max(evenCount, oddCount) << endl;
    return;
}

int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        solve();
    }
    return 0;
}
