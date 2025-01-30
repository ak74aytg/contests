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

bool hasCycle(int n, vector<int> adj[])
{
    bool vis[n];
    for(int i=0;i<n;i++){
        if(!vis[i]){
            vis[i] = true;
            if(check_for_cycle(i, -1, adj, vis)) return true;
        }
    }
    return false;
}


// bool check_for_cycle(int v, int n, vector<int> adj[], bool vis[]){
//     vis[v] = true;
//     queue<pair<int, int>> q;
//     q.push({v, -1});
//     while(!q.empty()){
//         int node = q.front().first;
//         int parent = q.front().second;
//         q.pop();
//         for(auto neighbour : adj[node]){
//             if(!vis[neighbour]){
//                 vis[neighbour] = true;
//                 q.push({neighbour, node});
//             }else{
//                 if(parent!=neighbour) return true;
//             }
//         }
//     }
//     return false;
// }

bool check_for_cycle(int node, int parent, vector<int> adj[], bool vis[]){
    for(auto neigh : adj[node]){
        if(vis[neigh]){
            if(parent != neigh) return true;
        } else{
            vis[neigh] = true;
            if(check_for_cycle(neigh, node, adj, vis)) return true; 
        }
    } 
    return false;
}