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


void dfs(int node, vector<int> adj[], vector<int> visited, stack<int> st){
    visited[node] = 1;
    for(auto neigh : adj[node]){
        if(visited[neigh] == 0){
            dfs(neigh, adj, visited, st);
        }
    }
    st.push(node);
}

vector<int> topologicalOrdering(int n, vector<int> adj[]){
    vector<int> visited(n, 0);
    stack<int> st;
    for(int i=0;i<n;i++){
        if(visited[i]==0){
            dfs(i, adj, visited, st);
        }
    }
    vector<int> ans;
    while(!st.empty()){
        ans.push_back(st.top());
        st.pop();
    }
    return ans;
}

int main(){
    
    return 0;
}