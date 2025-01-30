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

class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        queue<pair<int, int>> q;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[0].size();j++){
                if(grid[i][j] == 2) q.push({i, j});
            }
        }
        int time = -1;
        while(!q.empty()){
            int size = q.size();
            time++;
            int row[] = {-1, 0, 1, 0};
            int col[] = {0, 1, 0, -1};
            for(int i=0;i<size;i++){
                int r = q.front().first;
                int c = q.front().second;
                q.pop();
                for(int k=0;k<4;k++){
                    int newRow = r+row[k];
                    int newCol = c+col[k];
                    if(newRow>=0 && newCol>=0 && newRow<grid.size() && newCol<grid[0].size() && grid[newRow][newCol] == 1){
                        grid[newRow][newCol] = 2;
                        q.push({newRow, newCol});
                    }
                }
            }
        }
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return time!=-1?time:0;
    }

    vector<vector<int>> updateMatrix(vector<vector<int>>& mat) {
        vector<vector<int>> dist(mat.size(), vector<int>(mat[0].size(), INT_MAX));
        for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat[0].size();j++){
                if(mat[i][j]==0){
                    dist[i][j] = 0;
                }else{
                    int drow[] = {-1, 0, 1, 0};
                    int dcol[] = {0, 1, 0, -1};
                    for(int k=0;k<4;k++){
                        int row = i+drow[k];
                        int col = j+drow[k];
                        if(row>=0 && col>=0 && row<mat.size() && col<mat[0].size()){
                            dist[i][j] = min(dist[row][col]+1, dist[i][j]);
                        }
                    }
                }
            }
        }
        for(int i=0;i<dist.size();i++){
            for(int j=0;j<dist.size();j++){
                if(dist[i][j] == INT_MAX){
                    dist[i][j] = 0;
                }
            }
        }
        return dist;
    }










};

