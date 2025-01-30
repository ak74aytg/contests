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


bool isCycle(int V, vector<int> adj[]){
    vector<int> visited(V+1, 0);
    for(int i=1;i<V+1;i++){
        if(visited[i]==0){
            if(dfs(i, adj, visited)){
                return true;
            }
        }
    }
    return false;
}


bool dfs(int i, vector<int> adj[], vector<int>& visited){
    visited[i] = 2;
    for(auto neigh : adj[i-1]){
        if(visited[neigh]==0){
            if(dfs(neigh, adj, visited)){
                return true;
            }
        }else if(visited[i]==1){
            return true;
        }
    }
    visited[i] = 1;
    return false;
}
int main(){
    
    return 0;
}