class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> squares = new HashMap<>();  // key = (r / 3) * 3 + c / 3

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char cell = board[r][c];
                if (cell == '.') {
                    continue;
                }
                
                if (rows.getOrDefault(r, new HashSet<>()).contains(cell)
                        || cols.getOrDefault(c, new HashSet<>()).contains(cell)
                        || squares.getOrDefault((r / 3) * 3 + c / 3, new HashSet<>()).contains(cell)) {
                    return false;
                }
                
                if (!cols.containsKey(c)) {
                    cols.put(c, new HashSet<>());
                }
                cols.get(c).add(cell);
                
                if (!rows.containsKey(r)) {
                    rows.put(r, new HashSet<>());
                }
                rows.get(r).add(cell);
                
                int squareKey = (r / 3) * 3 + c / 3;
                if (!squares.containsKey(squareKey)) {
                    squares.put(squareKey, new HashSet<>());
                }
                squares.get(squareKey).add(cell);
            }
        }
        return true;
    
    }
}
