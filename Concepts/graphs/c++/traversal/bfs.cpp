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

int main()
{
    return 0;
}

vector<int> bfs(int n, vector<int> adj[])
{
    queue<int> q;
    vector<int> visited(n, 0);
    q.push(0);
    visited[0] = 1;
    vector<int> ans;
    while (!q.empty())
    {
        int u = q.front();
        ans.pb(u);
        q.pop();
        for (int v : adj[u])
        {
            if (!visited[v])
            {
                q.push(v);
                visited[v] = 1;
            }
        }
        return ans;
    }