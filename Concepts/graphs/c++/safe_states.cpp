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


bool dfs(int node, vector<vector<int>>& graph, vector<int>& vis, vector<int>& pathVis, vector<int>& check){
    vis[node] = 1;
    pathVis[node] = 1;
    for(auto neigh : graph[node]){
        if(vis[neigh]==0){
            if(dfs(neigh, graph, vis, pathVis, check)){
                check[node] = 0;
                return true;
            }
        }
        if(pathVis[neigh] == 1){
            check[node] = 0;
            return true;
        }
    }
    check[node] = 1;
    pathVis[node] = 0;
    return false;
}

vector<int> eventualSafeNodes(vector<vector<int>> &graph)
{
    int n = graph.size();
    vector<int> vis(n, 0);
    vector<int> pathVis(n, 0);
    vector<int> check(n, 0);

    for(int i=0;i<n;i++){
        if(vis[i]==0){
            dfs(i, graph, vis, pathVis, check);
        }
    }
    vector<int> ans;
    for(int i=0;i<n;i++){
        if(check[i]==1){
            ans.push_back(i);
        }
    }
    return ans;
}

int main()
{

    return 0;
}