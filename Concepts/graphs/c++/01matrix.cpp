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


vector<vector<int>> updateMatrix(vector<vector<int>>& mat) {
    int n = mat.size();
    int m = mat[0].size();
    bool visited[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            visited[i][j] = false;
        }
    }
    vector<vector<int>> dist(n, vector<int>(m, 0));
    queue<pair<pair<int,int>, int>> q;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(mat[i][j] == 0){
                q.push({{i, j}, 0});
                dist[i][j] = 0;
                visited[i][j] = true;
            }
        }
    }


    while(!q.empty()){
        int r = q.front().first.first;
        int c = q.front().first.second;
        int dis = q.front().second;
        q.pop();
        int drow[] = {1,0,-1,0};
        int dcol[] = {0, 1, 0, -1};
        for(int k=0;k<4;k++){
            int row = r + drow[k];
            int col = c + dcol[k];
            if(row>=0 && col>=0 && row<mat.size() && col<mat[0].size() && !visited[row][col]){
                dist[row][col] = dis+1;
                q.push({{row, col}, dis+1});
            }   
        }
    }
    return dist;
}

int main(){
    return 0;
}


