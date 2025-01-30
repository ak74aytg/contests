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


void solve(vector<vector<char>>& board) {
    int n = board.size();
    int m = board[0].size();
    vector<vector<bool>> visited(n, vector<bool>(m, false));
    for(int i=0;i<m;i++){
        if(board[0][i]=='O'){
            dfs(0, i, board, visited);
        }
        if(board[n-1][i]=='O'){
            dfs(n-1, i, board, visited);
        }
    }
    for(int i=0;i<n;i++){
        if(board[i][0]=='O'){
            dfs(i, 0, board, visited);
        }
        if(board[i][m-1]=='O'){
            dfs(i, m-1, board, visited);
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(board[i][j]=='O' && !visited[i][j]){
                board[i][j] = 'X';
            }
        }
    }
}


void dfs(int i, int j, vector<vector<char>>& board, vector<vector<bool>>& visited){
    visited[i][j] = true;
    int drow[] = {1,0,-1,0};
    int dcol[] = {0,1,0,-1};
    for(int k=0;k<4;k++){
        int row = i+drow[k];
        int col = j+dcol[k];
        if(row>=0 && col>=0 && row<board.size() && col<board[0].size() && board[row][col] == 'O' && !visited[row][col]){
            dfs(row, col, board, visited);
        }
    }
}

int main(){
    
    return 0;
}