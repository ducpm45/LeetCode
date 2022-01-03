package minhduc.training.leetcode;

public class _200_Number_of_Islands {
//	boolean[][] browsed = new boolean[300][300];
//	int m;
//	int n;
//
//	public boolean isValid(int i, int j) {
//
//		return i >= 0 && j >= 0 && i < m && j < n;
//	}
//
//	public void DFS(char[][] grid, int i, int j) {
//		if(!isValid(i,j)) return;
//		
//		if (grid[i][j] == '0' || browsed[i][j])
//			return;
//
//		browsed[i][j] = true;
//
//		DFS(grid, i, j + 1);
//		DFS(grid, i, j - 1);
//		DFS(grid, i + 1, j);
//		DFS(grid, i - 1, j);
//	}
//
//	public int numIslands(char[][] grid) {
//		m = grid.length;
//		n = grid[0].length;
//		int num = 0;
//
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				if (grid[i][j] == '1' && !browsed[i][j]) {
//					DFS(grid, i, j);
//					num++;
//				}
//			}
//		}
//
//		return num;
//	}

	public int numIslands(char[][] grid) {
		int num = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					num++;
					DFS(grid, i, j);
				}
			}
		}

		return num;
	}

	public void DFS(char[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
			return;

		grid[i][j] = '0';
		DFS(grid, i, j + 1);
		DFS(grid, i, j - 1);
		DFS(grid, i + 1, j);
		DFS(grid, i - 1, j);
	}
}
