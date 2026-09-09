class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, List<int[]>> locationMap = new HashMap();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (Character.isDigit(board[i][j])) {
                    locationMap.putIfAbsent(board[i][j], new ArrayList());
                    int[] location = {i, j};
                    locationMap.get(board[i][j]).add(location);
                }
            }
        }
        for (var locations : locationMap.values()) {
            for (int i = 0; i < locations.size(); i++) {
                for (int j = i + 1; j < locations.size(); j++) {
                    var location1 = locations.get(i);
                    var location2 = locations.get(j);
                    if (location1[0] == location2[0] || location1[1] == location2[1])
                        return false;
                    if (location1[0] / 3 == location2[0] / 3 && location1[1] / 3 == location2[1] / 3)
                        return false;
                }
            }
        }
        return true;
    }
}
