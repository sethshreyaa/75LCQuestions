import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int result = 0;

        // Store row frequencies in a map
        Map<List<Integer>, Integer> rowMap = new HashMap<>();

        // Populate rowMap with row lists
        for (int i = 0; i < n; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                rowList.add(grid[i][j]);
            }
            rowMap.put(rowList, rowMap.getOrDefault(rowList, 0) + 1);
        }

        // Check columns against rowMap
        for (int col = 0; col < n; col++) {
            List<Integer> colList = new ArrayList<>();
            for (int row = 0; row < n; row++) {
                colList.add(grid[row][col]);
            }

            // Add count of matching rows to result
            result += rowMap.getOrDefault(colList, 0);
        }

        return result;
    }
}
