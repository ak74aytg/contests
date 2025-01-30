#include <iostream>
#include <vector>

using namespace std;

void dfs(vector<vector<char>> &grid, vector<vector<bool>> &visited, int i, int j)
{
    visited[i][j] = true;
    // north
    if (i - 1 >= 0 && grid[i - 1][j] != '0' && visited[i - 1][j] == false)
    {
        dfs(grid, visited, i - 1, j);
    }
    // south
    if (i + 1 < grid.size() && grid[i + 1][j] != '0' && visited[i + 1][j] == false)
    {
        dfs(grid, visited, i + 1, j);
    }
    // east
    if (j + 1 < grid.size() && grid[i][j + 1] != '0' && visited[i][j + 1] == false)
    {
        dfs(grid, visited, i, j + 1);
    }
    // west
    if (j - 1 >= 0 && grid[i][j - 1] != '0' && visited[i][j - 1] == false)
    {
        dfs(grid, visited, i, j - 1);
    }
}

vector<vector<int>> floodFill(vector<vector<int>> &image, int sr, int sc, int color)
{
    bfs(image, sr, sc, color, image[sr][sc]);
}

void bfs(vector<vector<int>> &image, int sr, int sc, int newColor, int prevColor)
{
    queue<pair<int, int>> q;
    q.push({sr, sc});
    image[sr][sc] = newColor;
    vector<int> row = {-1, 0, 1, 0};
    vector<int> col = {0, 1, 0, -1};
    while (!q.empty())
    {
        int i = q.front().first;
        int j = q.front().second;
        q.pop();
        for(int i=0;i<4;i++){
            int newRow = i + row[i];
            int newCol = j + col[i];
            if(newRow>=0 && newRow<image.size() && newCol>=0 && newCol<image[0].size() && image[newRow][newCol]==prevColor){
                q.push({newRow, newCol});
                image[newRow][newCol] = newColor;
            }
        }
    }
}

void main()
{
    return;
}