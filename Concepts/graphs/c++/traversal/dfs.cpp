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

int main(){
    int n;
    vector<int> visited(n, 0);
    visited[0] = 1;
    int start = 0;
    int node = 0;
    vector<int> adj[n];
    vector<int> ans;
    dfs(start, adj, visited, ans);
    return 0;
}

void dfs(int node, vector<int> adj[], vector<int> visited, vector<int> &ans){
    for(auto u : adj[node]){
        if(!visited[u]){
            visited[u] = 1;
            ans.pb(u);
            dfs(u, adj, visited, ans);
        }
    }
}