public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                if (val == '.') continue;

                // Create unique keys for each constraint
                String rowKey = val + " in row " + r;
                String colKey = val + " in col " + c;
                String boxKey = val + " in box " + (r / 3) + "-" + (c / 3);

                // If any already exists, it's invalid
                if (seen.contains(rowKey) || seen.contains(colKey) || seen.contains(boxKey)) {
                    return false;
                }

                // Otherwise, store them
                seen.add(rowKey);
                seen.add(colKey);
                seen.add(boxKey);
            }
        }

        return true;
    }
}
